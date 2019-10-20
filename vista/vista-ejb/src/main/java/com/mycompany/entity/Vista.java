/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table(name = "vista")
public class Vista implements Serializable{
    @Id
    
    @Column(name = "id_estudiante")
    private int idEstudiante;
    
    @Column(name = "enombre")
    private String estudiante;
    
    @Column(name = "id_clase")
    private int idClase;
    
    @Column(name = "nombre")
    private String clase;

    @Column
    private int nota;

    public Vista() {
    }

    public Vista(int idEstudiante, String estudiante, int idClase, String clase, int nota) {
        this.idEstudiante = idEstudiante;
        this.estudiante = estudiante;
        this.idClase = idClase;
        this.clase = clase;
        this.nota = nota;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

   
    
    
}
