
package test;

import Datos.Conexion;
import java.sql.*;

public class ManejoUsuarios {
    public static void main(String[] args) {
       String sql = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";

        try (Connection conexion = Conexion.getConnection();
             Statement instruccion = conexion.createStatement();
             ResultSet resultado = instruccion.executeQuery(sql)) {

            conexion.setAutoCommit(false);

            while(resultado.next()) { 
                System.out.print("Id persona: " + resultado.getInt("idpersona"));
                System.out.print(", Nombre: " + resultado.getString("nombre"));
                System.out.print(", Apellido: " + resultado.getString("apellido"));
                System.out.print(", Email: " + resultado.getString("email"));
                System.out.print(", Telefono: " + resultado.getString("telefono"));
                System.out.println();
            }

            conexion.commit();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
        }
    }
        
}
