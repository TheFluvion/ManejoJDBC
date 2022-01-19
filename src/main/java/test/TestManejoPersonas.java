package test;

import Datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
      
        //Insertando un nuevo objeto del tipo persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "2613334455");
//        personaDao.insertar(personaNueva);

        //Modificar un objeto de persona existente
//        Persona personaModificar = new Persona(3, "Juan Carlos", "Esparza", "comoestas@mail.com", "2613334455");
//        personaDao.actualizar(personaModificar);

        //Eliminar persona
        Persona personaEliminar = new Persona(3);
        personaDao.eliminar(personaEliminar);

        
        //Listado personas
        List<Persona> personas = personaDao.seleccionar();
        
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }  
}
