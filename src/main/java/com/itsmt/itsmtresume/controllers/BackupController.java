package com.itsmt.itsmtresume.controllers;

import org.springframework.boot.web.context.ServerPortInfoApplicationContextInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(path = "/respaldo")
public class BackupController {

    private static final String DB_HOST = "localhost";

    private static final String DB_PORT = "3306";

    private static final String DB_NAME = "proyectocv";

    private static final String DB_USERNAME = "root";

    private static final String DB_PASSWORD = "Denisse28.";

    private static final String BACKUP_PATH = "C:\\Users\\denis\\backupdb";

    private static final String BACKUP_FILENAME = "backupproyectocv.sql";

    @PostMapping("/backup")
    public String backup() {
        String backupFilePath = BACKUP_PATH + File.separator + BACKUP_FILENAME;

        try {
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "C:\\Program Files\\MySQL\\MySQL Server 8.0\\bin\\mysqldump.exe",
                    "--host=" + DB_HOST,
                    "--port=" + DB_PORT,
                    "--user=" + DB_USERNAME,
                    "--password=" + DB_PASSWORD,
                    "--databases",
                    DB_NAME,
                    "--result-file=" + backupFilePath);

            Process process = processBuilder.start();
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Backup created seccessfully at: " + backupFilePath);
            } else {
                System.err.println("Backup process failed with exit code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "Respaldo de la base de datos exitoso";
    }
}