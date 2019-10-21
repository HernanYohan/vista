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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Hernan
 */
@Entity
@Table(name = "estudiante")
public class Estudiante implements Serializable {
    /**s
     * mapeo de las tablas 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private int idEstudiante;
    @Column
    private String nombre;
    
    @Column
    private int cedula;
    
    @OneToMany(mappedBy = "estudiante",cascade = CascadeType.ALL)
    private List<EstudianteClase> listaVsEstudiante;

    public Estudiante() {
    }

    
    
    public Estudiante(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public List<EstudianteClase> getListaEstudianteClase() {
        return listaVsEstudiante;
    }

    public void setListaEstudianteClase(List<EstudianteClase> listaEstudianteClase) {
        this.listaVsEstudiante = listaEstudianteClase;
    }
    
    
    
}
