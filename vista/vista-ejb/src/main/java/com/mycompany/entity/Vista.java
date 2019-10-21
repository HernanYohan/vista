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
    @Column
    private String clase;

    @Column
    private String estudiante;

    @Column
    private int nota;

    public Vista() {
    }

    public Vista(String clase, String estudiante, int nota) {
        this.clase = clase;
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

}
