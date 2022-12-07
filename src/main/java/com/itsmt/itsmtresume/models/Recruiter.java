package com.itsmt.itsmtresume.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reclutadora")
public class Recruiter {
    
    @Id
    @Column(name = "Nombre", nullable = true)
    private String nombre;

    @Column(name = "Giro")
    private String giro;

    @Column(name = "Ubicacion")
    private String ubicacion;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Email")
    private String email;

    @Column(name = "SitioWeb")
    private String sitioWeb;

    //Metodos Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    //Constructores
    public Recruiter() {
    }

    public Recruiter(String nombre, String giro, String ubicacion, String telefono, String email, String sitioWeb) {
        this.nombre = nombre;
        this.giro = giro;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
        this.email = email;
        this.sitioWeb = sitioWeb;
    }

    //Relacion entre la clase escuela y reclutadora
    //@NotEmpty
    //@ManyToMany(fetch = FetchType.LAZY)
    //@JoinTable(name = "school_recluiter",
                //joinColumns = @JoinColumn(name = "recruiter_nombre"), 
                //inverseJoinColumns = @JoinColumn(name = "school_clave")
              //)
}
