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
public class EstudianteDto {
    
    private int idEstudianteDto;
    private String nombreDto;
    private int cedulaDto;

    public EstudianteDto() {
    }

    public EstudianteDto(String nombreDto, int cedulaDto) {
        this.nombreDto = nombreDto;
        this.cedulaDto = cedulaDto;
    }

    public int getIdEstudianteDto() {
        return idEstudianteDto;
    }

    public void setIdEstudianteDto(int idEstudianteDto) {
        this.idEstudianteDto = idEstudianteDto;
    }

    public String getNombreDto() {
        return nombreDto;
    }

    public void setNombreDto(String nombreDto) {
        this.nombreDto = nombreDto;
    }

    public int getCedulaDto() {
        return cedulaDto;
    }

    public void setCedulaDto(int cedulaDto) {
        this.cedulaDto = cedulaDto;
    }

  
   
    
}
