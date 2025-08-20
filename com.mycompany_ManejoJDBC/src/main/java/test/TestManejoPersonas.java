
package test;

import Datos.*;
import datos.UsuarioDAO;
import domain.*;
import java.util.*;

/**
 *
 * @author Viviana
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
//        
//       
//        //Insertando un nuevo objeto tipo persona
//        //Persona persona1 = new Persona("Carlos", "Diaz", "cdiaz@gmail.com", "9673451298");
//        //personaDao.insertar(persona1);
//        
//        //Modificar un registro
////        Persona personaMod = new Persona(4, "Katia", "Lopez", "klopez@gmail.com", "999888777");
////        personaDao.modificar(personaMod);
////
////        //Eliminar un registro
////         Persona personaDel = new Persona(6); 
////        personaDao.eliminar(personaDel);
//        
//        
        List<Persona> personas =  personaDao.seleccionar();
        
        for(Persona persona: personas){
            System.out.println("Persona = " + persona);
        }
//        
//        
//        
////        personas.forEach( persona -> {
////           System.out.println("Persona = " + persona);
////        });
System.out.println("----------------------------------------------------");
UsuarioDAO usuarioDao = new UsuarioDAO();
 
       
      //  Insertando un nuevo objeto tipo persona
//        Usuario usuario1 = new Usuario("Karla", "506");
//        usuarioDao.insertar(usuario1);
        
//        //Modificar un registro
//        Usuario usuarioMod = new Usuario(4, "Katia", "506");
//        usuarioDao.modificar(usuarioMod);
//
//        //Eliminar un registro
         Usuario usuarioDel = new Usuario(4); 
         usuarioDao.eliminar(usuarioDel);
        
//        
        List<Usuario> usuarios =  usuarioDao.seleccionar();
        
        for(Usuario usuario: usuarios){
            System.out.println("usuario = " + usuario);
        }
        
//        
        
//        personas.forEach( persona -> {
//           System.out.println("Persona = " + persona);
//        });
    
    }
}
