package com.itsmt.itsmtresume.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Entity
@Table(name = "cuenta")
public class Account {
    
    @Id
    @Column(name = "correo")
    @Email
    private String correo;

    @Column(name = "contraseña")
    private String contraseña;

    @Column(name = "nombre")
    private String nombre;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Account() {
    }

    public Account(String correo, String contraseña, String nombre) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    @OneToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
