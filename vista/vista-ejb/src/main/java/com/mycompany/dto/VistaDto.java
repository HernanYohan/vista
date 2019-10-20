/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

/**
 *
 * @author Hernan
 */
public class VistaDto {
    
    private int idEstudianteDto;
    private String estudianteDto;
    private int idClaseDto;
    private String claseDto;
    private int notaDto;

    public VistaDto() {
    }

    public VistaDto(int idEstudianteDto, String estudianteDto, int idClaseDto, String claseDto, int notaDto) {
        this.idEstudianteDto = idEstudianteDto;
        this.estudianteDto = estudianteDto;
        this.idClaseDto = idClaseDto;
        this.claseDto = claseDto;
        this.notaDto = notaDto;
    }

    public int getIdEstudianteDto() {
        return idEstudianteDto;
    }

    public void setIdEstudianteDto(int idEstudianteDto) {
        this.idEstudianteDto = idEstudianteDto;
    }

    public String getEstudianteDto() {
        return estudianteDto;
    }

    public void setEstudianteDto(String estudianteDto) {
        this.estudianteDto = estudianteDto;
    }

    public int getIdClaseDto() {
        return idClaseDto;
    }

    public void setIdClaseDto(int idClaseDto) {
        this.idClaseDto = idClaseDto;
    }

    public String getClaseDto() {
        return claseDto;
    }

    public void setClaseDto(String claseDto) {
        this.claseDto = claseDto;
    }

    public int getNotaDto() {
        return notaDto;
    }

    public void setNotaDto(int notaDto) {
        this.notaDto = notaDto;
    }
    
    
    
}
