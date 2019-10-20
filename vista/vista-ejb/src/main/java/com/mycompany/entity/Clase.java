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
@Table(name = "clase")
public class Clase implements Serializable {
    /**s
     * mapeo de las tablas 
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clase")
    private int idClase;
    @Column
    private String nombre;
    
    @Column
    private int duracion;
    
    @OneToMany(mappedBy = "clase",cascade = CascadeType.ALL)
    private List<EstudianteClase> listaVsClase;

    public Clase() {
    }

    public Clase(String nombre, int duracion, List<EstudianteClase> listaVsClase) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.listaVsClase = listaVsClase;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<EstudianteClase> getListaVsClase() {
        return listaVsClase;
    }

    public void setListaVsClase(List<EstudianteClase> listaVsClase) {
        this.listaVsClase = listaVsClase;
    }
    
}
