
package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepciones {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        boolean continuarEjecucion = true;
        
        do{
            try{
            System.out.println("Ingrese N1: ");
            int n1 = leer.nextInt();
            System.out.println("Ingrese N2: ");
            int n2 = leer.nextInt();
        
            int resultado = n1 / n2;
        
            System.out.println("El resutado es -->" + resultado);
            continuarEjecucion = false;
            
        }catch (InputMismatchException e){
            System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
            e.printStackTrace(System.out);
        }catch (ArithmeticException e){
            System.err.println("No se puede dividir por 0");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Se reviso la division");
        }
            
        }while(continuarEjecucion);
        
        
    }
}
