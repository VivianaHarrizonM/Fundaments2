
package beans;

/**
 *
 * @author Viviana
 */
public class Rectangulo {
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Método para calcular el area de un rectangulo
    public int getArea(){
       return this.base * this.altura; 
    }
}
