package pe.edu.cibertec.proyectocurso.managedbean;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class ForoManagedBean implements Serializable {

	public ForoManagedBean() {
	}
	
	public String listarForo() {
        
        return "/foro/listaForo";
    }
	
public String prepareCrear() {
        
        return "/foro/CrearForo";
    }

}
