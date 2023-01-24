/*Armar una clase estilo math */

/* public -> de uso prublico ;  private -> solo se puede usar en el mismo package

/*al agregar final hace a la variable constante*/
package clases;

public class Calculadora {
    public static final double PI = 3.141592;
    
    public static int sumar(int a, int b){
        return a + b;
    }
    
    public static double sumar(double a, double b){
        return a + b;
    }
    
    ///Sobrecarga de métodos
    
    public int resta(int a , int b){
        return a - b;
    }
    
    public double resta(double a , double b){
        return a - b;
    }
}
