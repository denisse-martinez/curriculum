package com.itsmt.itsmtresume.models;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "habilidadespersona")
public class Skills implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Tipo")
    private String tipo;

    @Column(name = "Descripcion")
    private String descripcion;
    
    //Relación de clases
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_matricula")
    private User user;
    
    public Skills() {
    }

    public Skills(int id, String tipo, String descripcion, User user) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.user = user;
	}

	public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
