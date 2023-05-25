package com.itsmt.itsmtresume.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BackupPageController {

    @GetMapping("/respaldo")
    public String backupPage() {
        return "backup.html";
    }
}
