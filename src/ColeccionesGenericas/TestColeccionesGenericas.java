package ColeccionesGenericas;

import java.util.*;

public class TestColeccionesGenericas {
//     public static void main(String[] args) {
//        List<String> miLista = new ArrayList<>();
//        miLista.add("Lunes");
//        miLista.add("Martes");
//        miLista.add("Miercoles");
//        miLista.add("Jueves");
//        miLista.add("Viernes");
//        miLista.add("Sabado");
//        miLista.add("Domingo");
//        
//        Map<String, String> miMapa = new HashMap<>();
//        miMapa.put("Valor1", "Juan");
//        miMapa.put("Valor2", "Karen");
//        miMapa.put("Valor3", "Lili");
//        
//        
//        
//          Set miSet = new HashSet();
//          miSet.add("Lunes");
//          miSet.add("Martes");
//          miSet.add("Miercoles");
//          miSet.add("Jueves");
//          miSet.add("Viernes");
//          miSet.add("Sabado");
//          miSet.add("Domingo");
//          
//          String elementoMapa = (String) miMapa.get("valor1");
//         System.out.println("elementoMapa = " + elementoMapa);
//         imprimir(miMapa.keySet());
//         imprimir(miMapa.values());
////          System.out.println("Mi lista");
////          imprimir(miLista);
////          System.out.println("Mi Set");
////          imprimir(miSet);
//
//          }
    public static void imprimir(Collection<String> coleccion){
              coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
          });
    }
}
