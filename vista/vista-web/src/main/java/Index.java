
import com.mycompany.entity.Clase;
import com.mycompany.entity.Estudiante;
import com.mycompany.interfaces.ClaseFacadeLocal;
import com.mycompany.interfaces.EstudianteFacadeLocal;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

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
    
    @EJB
    private EstudianteFacadeLocal estudianteFacade;   
    
    private Estudiante estudiantes;
    
    private Clase clases;
 
    
    @EJB
    private ClaseFacadeLocal claseFacade;
    
    public void crearEstudiante(){
        estudiantes = new Estudiante("Sonia", 2, null);
        estudianteFacade.create(estudiantes);   
    }
    
    public void crearClase(){
        clases = new Clase("Linea", 4, null);
        claseFacade.create(clases);
    }   
}
