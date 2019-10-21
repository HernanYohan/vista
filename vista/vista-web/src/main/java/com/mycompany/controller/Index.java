package com.mycompany.controller;

import com.mycompany.dto.ClaseDto;
import com.mycompany.dto.EstudianteDto;
import com.mycompany.dto.VistaDto;
import com.mycompany.entity.Clase;
import com.mycompany.entity.Estudiante;
import com.mycompany.entity.EstudianteClase;
import com.mycompany.interfaces.ClaseFacadeLocal;
import com.mycompany.interfaces.EstudianteClaseFacadeLocal;
import com.mycompany.interfaces.EstudianteFacadeLocal;
import com.mycompany.interfaces.VistaFacadeLocal;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hernan
 */
@ManagedBean
@RequestScoped
public class Index implements Serializable {

    private String nombre;
    private Integer cedula;
    private String nombreC;
    private Integer duracion;
    private Integer clase;
    private Integer estudiante;
    private Integer nota;
    

    @EJB
    private EstudianteFacadeLocal estudianteFacade;

    @EJB
    private VistaFacadeLocal vistaFacade;

    @EJB
    private ClaseFacadeLocal claseFacade;

    @EJB
    private EstudianteClaseFacadeLocal EstudianteclaseFacade;

    private Estudiante estudiantes;

    private Clase clases;

    private EstudianteClase estuclas;

    private List<EstudianteDto> EstuDto = new ArrayList<>();
    public void crearEstudiante(String nombre, int cedula) {
        EstudianteDto estudianteDto1 = new EstudianteDto(nombre, cedula);

        estudiantes = new Estudiante(estudianteDto1.getNombreDto(), estudianteDto1.getCedulaDto());
        estudianteFacade.create(estudiantes);

        FacesMessage msg = new FacesMessage("Agregar Estudiante", estudianteDto1.getNombreDto() + "  a sido agregado");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void crearClase(String nombre, int duracion) {

        ClaseDto claseDto1 = new ClaseDto(nombre, duracion);
        clases = new Clase(claseDto1.getNombreDto(), claseDto1.getDuracionDto());
        claseFacade.create(clases);

        FacesMessage msg = new FacesMessage("Agregar Clase", "La " + claseDto1.getNombreDto() + "  a sido agregada");
        FacesContext.getCurrentInstance().addMessage(null, msg);

    }

    public void crearClaseEstudiante(int idc, int ide) {
        clases = claseFacade.find(idc);
        estudiantes = estudianteFacade.find(ide);
        estuclas = new EstudianteClase(0);
        estuclas.setClase(clases);
        estuclas.setEstudiante(estudiantes);

        List<EstudianteClase> listaEstudianteClase = new ArrayList<>();
        listaEstudianteClase.add(estuclas);
        clases.setListaVsClase(listaEstudianteClase);
        estudiantes.setListaEstudianteClase(listaEstudianteClase);
        claseFacade.edit(clases);
        estudianteFacade.edit(estudiantes);

        FacesMessage msg = new FacesMessage("Agregar Estudiante a Clase", "El estudiante" + estudiantes.getNombre() + "  a sido agregada a la clase "+clases.getNombre());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void mostrarEstudiantesNoClase(AjaxBehaviorEvent event) {
        List<EstudianteClase> listaClaseEstudiante = EstudianteclaseFacade.findAll();
        List<Estudiante> listaEstudiante = estudianteFacade.findAll();
        EstudianteDto eDto;
        for (Estudiante estudiante1 : listaEstudiante) {
            eDto = new EstudianteDto(estudiante1.getNombre(), estudiante1.getCedula());
            EstuDto.add(eDto);
        }
        int idClase = clase;
       
        for (EstudianteClase estudianteClase1 : listaClaseEstudiante) {

            if (estudianteClase1.getClase().getIdClase() == idClase) {

                Estudiante estudiante1 = estudianteClase1.getEstudiante();

                for (Estudiante estudiante2 : listaEstudiante) {
                    if (estudiante1.getCedula() == estudiante2.getCedula()) {
                        EstuDto.remove(estudiante2);
                    }

                }

            }

        }

      
    }

    public List<ClaseDto> mostrarClases() {
        List<Clase> listaC = claseFacade.findAll();
        List<ClaseDto> listaCDto = new ArrayList<>();
        ClaseDto cDto;

        for (Clase c1 : listaC) {
            cDto = new ClaseDto(c1.getNombre(), c1.getDuracion());
            listaCDto.add(cDto);
        }
        
        return listaCDto;

    }

    public void mostrarVista() {
        System.out.println("si");
        List<VistaDto> vista = vistaFacade.obtenerEstudiantesConStore(4);

        for (VistaDto vista1 : vista) {
            System.out.println(vista1.getClaseDto() + "  ," + vista1.getEstudianteDto() + "  ," + vista1.getNotaDto());

        }

    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public EstudianteFacadeLocal getEstudianteFacade() {
        return estudianteFacade;
    }

    public void setEstudianteFacade(EstudianteFacadeLocal estudianteFacade) {
        this.estudianteFacade = estudianteFacade;
    }

    public VistaFacadeLocal getVistaFacade() {
        return vistaFacade;
    }

    public void setVistaFacade(VistaFacadeLocal vistaFacade) {
        this.vistaFacade = vistaFacade;
    }

    public ClaseFacadeLocal getClaseFacade() {
        return claseFacade;
    }

    public void setClaseFacade(ClaseFacadeLocal claseFacade) {
        this.claseFacade = claseFacade;
    }

    public EstudianteClaseFacadeLocal getEstudianteclaseFacade() {
        return EstudianteclaseFacade;
    }

    public void setEstudianteclaseFacade(EstudianteClaseFacadeLocal EstudianteclaseFacade) {
        this.EstudianteclaseFacade = EstudianteclaseFacade;
    }

    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Clase getClases() {
        return clases;
    }

    public void setClases(Clase clases) {
        this.clases = clases;
    }

    public EstudianteClase getEstuclas() {
        return estuclas;
    }

    public void setEstuclas(EstudianteClase estuclas) {
        this.estuclas = estuclas;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getClase() {
        return clase;
    }

    public void setClase(Integer clase) {
        this.clase = clase;
    }

    public Integer getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Integer estudiante) {
        this.estudiante = estudiante;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public List<EstudianteDto> getEstuDto() {
        return EstuDto;
    }

    public void setEstuDto(List<EstudianteDto> EstuDto) {
        this.EstuDto = EstuDto;
    }

    

}
