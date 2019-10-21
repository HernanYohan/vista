/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table(name = "estudiante_clase")
public class EstudianteClase implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante_clase")
    private int idEstudianteClase;
    
    @ManyToOne
    @JoinColumn(name = "id_estudiante",nullable = false)
    private Estudiante estudiante;

    
    @ManyToOne
    @JoinColumn(name = "id_clase",nullable = false)
    private Clase clase;
    
    @Column
    private int nota;

    public EstudianteClase() {
    }

    public EstudianteClase(int nota) {
        this.nota = nota;
    }

    public int getIdEstudianteClase() {
        return idEstudianteClase;
    }

    public void setIdEstudianteClase(int idEstudianteClase) {
        this.idEstudianteClase = idEstudianteClase;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
 
}
