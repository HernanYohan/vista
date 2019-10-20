/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.util.List;

/**
 *
 * @author Hernan
 */
public class ClaseDto {
       
    private int idClaseDto;
    private String nombreDto;
    private int duracionDto;
    private List<EstudianteClaseDto> listaVsClaseDto;

    public ClaseDto() {
    }

    public ClaseDto(String nombreDto, int duracionDto, List<EstudianteClaseDto> listaVsClaseDto) {
       
        this.nombreDto = nombreDto;
        this.duracionDto = duracionDto;
        this.listaVsClaseDto = listaVsClaseDto;
    }

    public int getIdClaseDto() {
        return idClaseDto;
    }

    public void setIdClaseDto(int idClaseDto) {
        this.idClaseDto = idClaseDto;
    }

    public String getNombreDto() {
        return nombreDto;
    }

    public void setNombreDto(String nombreDto) {
        this.nombreDto = nombreDto;
    }

    public int getDuracionDto() {
        return duracionDto;
    }

    public void setDuracionDto(int duracionDto) {
        this.duracionDto = duracionDto;
    }

    public List<EstudianteClaseDto> getListaVsClaseDto() {
        return listaVsClaseDto;
    }

    public void setListaVsClaseDto(List<EstudianteClaseDto> listaVsClaseDto) {
        this.listaVsClaseDto = listaVsClaseDto;
    }
    
    
}
