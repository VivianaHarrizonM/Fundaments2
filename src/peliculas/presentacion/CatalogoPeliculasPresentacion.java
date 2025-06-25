
package peliculas.presentacion;

import java.util.Scanner;
import peliculas.Servicio.*;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while(opcion != 0){
            System.out.println("Elige una opción \n"
                + "1. Iniciar catalogo de peliculas \n"
                + "2. Agregar pelicula\n"
                + "3. Listar pelicula \n"
                + "4. Buscar pelicula \n"
                + "0. Salir \n");
            opcion = Integer.parseInt(scanner.nextLine());
        
         
        }
    }
}
