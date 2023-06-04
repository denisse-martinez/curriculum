package com.itsmt.itsmtresume.models;

import java.io.Serializable;
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
@Table(name = "experiencialaboral")
public class WorkExperience implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Puesto")
    private String puesto;

    @Column(name= "Lugar")
    private String lugar;

    @Column(name = "fecha_comienzo")
    private LocalDate fechaComienzo;

    @Column(name = "fecha_termino")
    private LocalDate fechaTermino;

    @Column(name = "descripcion_funciones")
    private String descripcion;

    @Column(name = "nombre_empresa")
    private String empresa;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_matricula")
    private User user;
    
    public WorkExperience() {
    }

    public WorkExperience(int id, String puesto, String lugar, LocalDate fechaComienzo, LocalDate fechaTermino,
			String descripcion, String empresa, User user) {
		super();
		this.id = id;
		this.puesto = puesto;
		this.lugar = lugar;
		this.fechaComienzo = fechaComienzo;
		this.fechaTermino = fechaTermino;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.user = user;
	}

	public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(LocalDate fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public LocalDate getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(LocalDate fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
