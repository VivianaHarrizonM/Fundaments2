
package test;

import Datos.*;
import domain.*;
import java.sql.*;

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
            
            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdpersona(2);
            cambioPersona.setNombre("Carmen");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("CGomez@mail.com");
            cambioPersona.setTelefono("2345654789");
            
            personaJdbc.modificar(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Axel");
            nuevaPersona.setApellido("Trujillo");
            nuevaPersona.setEmail("Atrujillo@mail.com");
            nuevaPersona.setTelefono("9345654789");
            personaJdbc.insertar(nuevaPersona);
            
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
