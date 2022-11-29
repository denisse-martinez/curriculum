package com.itsmt.itsmtresume.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "escuela")
public class School {
    
    @Id
    private String clave;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Municipio")
    private String municipio;

    @Column(name = "Estado")
    private String estado;

    @Column(name = "Direccion")
    private String direccion;

    @Column(name = "CorreoElectronico")
    private String correo;

    @Column(name = "SitioWeb")
    private String sitioWeb;

    
    //Metodos Getter and Setter
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }


    //Constructores
    public School() {
    }

    public School(String clave, String nombre, String municipio, String estado, String direccion, String correo,
            String sitioWeb) {
        this.clave = clave;
        this.nombre = nombre;
        this.municipio = municipio;
        this.estado = estado;
        this.direccion = direccion;
        this.correo = correo;
        this.sitioWeb = sitioWeb;
    }

    
}
