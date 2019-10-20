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
public class EstudianteClaseDto {
    
    private int idEstudianteClaseDto;
    private EstudianteDto estudianteDto;
    private ClaseDto claseDto;
    private int notaDto;

    public EstudianteClaseDto() {
    }

    public EstudianteClaseDto(EstudianteDto estudianteDto, ClaseDto claseDto, int notaDto) {
        this.estudianteDto = estudianteDto;
        this.claseDto = claseDto;
        this.notaDto = notaDto;
    }

    public int getIdEstudianteClaseDto() {
        return idEstudianteClaseDto;
    }

    public void setIdEstudianteClaseDto(int idEstudianteClaseDto) {
        this.idEstudianteClaseDto = idEstudianteClaseDto;
    }

    public EstudianteDto getEstudianteDto() {
        return estudianteDto;
    }

    public void setEstudianteDto(EstudianteDto estudianteDto) {
        this.estudianteDto = estudianteDto;
    }

    public ClaseDto getClaseDto() {
        return claseDto;
    }

    public void setClaseDto(ClaseDto claseDto) {
        this.claseDto = claseDto;
    }

    public int getNotaDto() {
        return notaDto;
    }

    public void setNotaDto(int notaDto) {
        this.notaDto = notaDto;
    }
    
    
    
}
