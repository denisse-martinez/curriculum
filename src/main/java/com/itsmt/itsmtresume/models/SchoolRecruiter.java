package com.itsmt.itsmtresume.models;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.yaml.snakeyaml.events.Event.ID;

@Entity
@Table(name = "escuela_reclutadora")
public class SchoolRecruiter {

    @Embeddable
    public static class Id implements Serializable{
        @Column(name = "Escuela_Clave")
        private String escuelaClave;
    
        @Column(name = "Reclutadora_Nombre")
        private String reclutadoraNombre;

        public Id() {
        }

        public Id(String escuelaClave, String reclutadoraNombre) {
            this.escuelaClave = escuelaClave;
            this.reclutadoraNombre = reclutadoraNombre;
        }

        public boolean equals(Object o) {
            if (o != null && o instanceof Id) {
                Id that = (Id) o;
                return this.escuelaClave.equals(that.escuelaClave) &&
                       this.reclutadoraNombre.equals(that.reclutadoraNombre);
            } else {
                return false;
            }
        }

        public int hashCode() {
            return escuelaClave.hashCode() + reclutadoraNombre.hashCode();
        }
    }

    @EmbeddedId
    private Id id = new Id();

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "EstatusConvenio")
    private String estatusConvenio;

    @ManyToOne
    @JoinColumn(name = "Escuela_Clave",
                insertable = false,
                updatable = false)
    private School school;

    @ManyToOne
    @JoinColumn(name = "Reclutadora_Nombre",
                insertable = false,
                updatable = false)
    private Recruiter recruiter;

    public SchoolRecruiter() {
    }

   /* public SchoolRecruiter(String nombre, String estatusConvenio, School school, Recruiter recruiter) {
        this.nombre = nombre;
        this.estatusConvenio = estatusConvenio;
        this.school = school;
        this.recruiter = recruiter;

        this.id.escuelaClave = school.getId();
        this.id.reclutadoraNombre = recruiter.getId();

        school.getSchoolRecruiters().add(this);
        recruiter.getSchoolRecruiters().add(this);
    }*/

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatusConvenio() {
        return estatusConvenio;
    }

    public void setEstatusConvenio(String estatusConvenio) {
        this.estatusConvenio = estatusConvenio;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }

    


    

    

    

    
    
}
