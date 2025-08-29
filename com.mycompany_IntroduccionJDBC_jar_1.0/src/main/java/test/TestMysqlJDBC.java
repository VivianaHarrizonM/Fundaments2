
package test;

import java.sql.*;

public class TestMysqlJDBC {
    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        //try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
           
        //} catch (ClassNotFoundException ex) {
          //  ex.printStackTrace(System.out);
        try{
             Connection conexion = DriverManager.getConnection(url, "root", "admin");
             Statement instruccion = conexion.createStatement();
             var sql = "SELECT idpersona, nombre, apellido, email, telefono FROM persona";
             ResultSet resultado = instruccion.executeQuery(sql);
             while(resultado.next()){ 
                 System.out.print("Id persona: " + resultado.getInt("idpersona"));
                 System.out.print(", Nombre: " +resultado.getString("nombre"));
                 System.out.print(", Apellido: " +resultado.getString("apellido"));
                 System.out.print(", Email: " +resultado.getString("email"));
                 System.out.print(", Telefono: " +resultado.getString("telefono"));
                 System.out.println("");
             }
             resultado.close();
             instruccion.close();
             conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
}
