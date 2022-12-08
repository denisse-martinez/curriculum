package com.itsmt.itsmtresume.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Entity
@Table(name = "usuario")
public class User {
    
    @Id
    @Column(name = "Matricula")
    private String matricula;

    @Column(name = "Nombre", nullable = false)
	private String nombre;
    
    @Column(name = "Apellidos", nullable = false)
    private String apellidos;

    @Column(name = "Email")
    private String email;

    @Column(name = "Contraseña")
    private String contraseña;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "CURP")
    private String curp;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "FechaNacimiento")
    private LocalDate fechaNac;

    @Column(name = "Carrera")
    private String carrera;

    @Column(name = "Sexo")
    private String sexo;

    @Column(name = "NoIMSS")
    private String noIMSS;

    @Column(name = "TituloProfesional")
    private String prefesion;

    @Column(name = "CedulaProfesional")
    private String cadula;


    //Metodos Getter and Setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNoIMSS() {
        return noIMSS;
    }

    public void setNoIMSS(String noIMSS) {
        this.noIMSS = noIMSS;
    }

    public String getPrefesion() {
        return prefesion;
    }

    public void setPrefesion(String prefesion) {
        this.prefesion = prefesion;
    }

    public String getCadula() {
        return cadula;
    }

    public void setCadula(String cadula) {
        this.cadula = cadula;
    }


    //Constructores
    public User() {
    }

    public User(String matricula, String nombre, String apellidos, String email, String contraseña, String direccion,
            String curp, String telefono, LocalDate fechaNac, String carrera, String sexo, String noIMSS,
            String prefesion, String cadula) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.curp = curp;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.carrera = carrera;
        this.sexo = sexo;
        this.noIMSS = noIMSS;
        this.prefesion = prefesion;
        this.cadula = cadula;
    }

    //Relación de la clase usuario con la clase escuela
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school")
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}
