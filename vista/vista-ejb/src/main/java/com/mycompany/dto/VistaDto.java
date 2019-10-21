/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dto;

import java.io.Serializable;

/**
 *
 * @author Hernan
 */
public class VistaDto implements Serializable{
    
    
    private String estudianteDto;
    private String claseDto;
    private int notaDto;

    public VistaDto() {
    }

    public VistaDto(String estudianteDto,String claseDto, int notaDto) {
        this.estudianteDto = estudianteDto;
        this.claseDto = claseDto;
        this.notaDto = notaDto;
    }



    public String getEstudianteDto() {
        return estudianteDto;
    }

    public void setEstudianteDto(String estudianteDto) {
        this.estudianteDto = estudianteDto;
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
