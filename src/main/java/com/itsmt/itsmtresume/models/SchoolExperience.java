package com.itsmt.itsmtresume.models;

import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "experienciaescolar")
public class SchoolExperience implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "Titutlo")
    private String titulo;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "NoHoras")
    private int noHoras;

    @Column(name = "FechaExpedicion")
    private LocalDate fechaExpedicion;

    @Column(name = "Institucion")
    private String institucion;

    @Column(name = "Archivo")
    private Blob archivo;
    
  //Relacion con usuario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Usuario_Matricula")
    private User user;
    
    public SchoolExperience() {
    }
    
    public SchoolExperience(int id, String titulo, String descripcion, int noHoras, LocalDate fechaExpedicion,
			String institucion, Blob archivo, User user) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.noHoras = noHoras;
		this.fechaExpedicion = fechaExpedicion;
		this.institucion = institucion;
		this.archivo = archivo;
		this.user = user;
	}

	public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNoHoras() {
        return noHoras;
    }

    public void setNoHoras(int noHoras) {
        this.noHoras = noHoras;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Blob getArchivo() {
        return archivo;
    }

    public void setArchivo(Blob archivo) {
        this.archivo = archivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
