package com.itsmt.itsmtresume.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "usuario")
public class User implements Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "Matricula")
    @NotEmpty 
    private String matricula;

    @Column(name = "Nombre")
    @NotEmpty 
	private String nombre;
    
    @Column(name = "Apellidos")
    @NotEmpty 
    private String apellidos;

    @Column(name = "Email")
    private String email;

    @Column(name = "Direccion")
    @NotEmpty
    private String direccion;

    @Column(name = "CURP")
    @NotEmpty
    private String curp;

    @Column(name = "Telefono")
    @NotEmpty
    private String telefono;

    @Column(name = "fecha_nac")
    private LocalDate fechaNac;

    @Column(name = "Carrera")
    @NotEmpty
    private String carrera;

    @Column(name = "Sexo")
    @NotEmpty 
    private String sexo;

    @Column(name = "NoIMSS")
    @NotEmpty 
    private String noIMSS;

    @Column(name = "titulo_prof")
    private String prefesion;

    @Column(name = "cedula_prof")
    private String cedula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clave")
    private School school;
    
  //Constructores
    public User() {
    }
    
    public User(@NotEmpty String matricula, @NotEmpty String nombre, @NotEmpty String apellidos, String email,
		@NotEmpty String direccion, @NotEmpty String curp, @NotEmpty String telefono, LocalDate fechaNac,
		@NotEmpty String carrera, @NotEmpty String sexo, @NotEmpty String noIMSS, String prefesion, String cedula,
		School school) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.direccion = direccion;
		this.curp = curp;
		this.telefono = telefono;
		this.fechaNac = fechaNac;
		this.carrera = carrera;
		this.sexo = sexo;
		this.noIMSS = noIMSS;
		this.prefesion = prefesion;
		this.cedula = cedula;
		this.school = school;
    }


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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

}
