
package test;

import Datos.*;
import domain.*;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            
            
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            List<PersonaDTO> personas= personaDao.seleccionar();
            
            for(PersonaDTO persona: personas){
                System.out.println("PersonaDTO = " + persona);
            }
            
           
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
