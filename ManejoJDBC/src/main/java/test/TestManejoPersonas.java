
package test;

import Datos.*;
import datos.UsuarioDAO;
import domain.*;
import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Viviana
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdpersona(2);
            cambioPersona.setNombre("Carmen");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("CGomez@mail.com");
            cambioPersona.setTelefono("2345654789");
            
            personaDao.modificar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Axel");
            nuevaPersona.setApellido("Trujillo");
            nuevaPersona.setEmail("Atrujillo@mail.com");
            nuevaPersona.setTelefono("9345654789");
            personaDao.insertar(nuevaPersona);
            
            conexion.commit();
            System.out.println("Se ha hecho commit de la transacción");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rooback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
        
    
    }
}
