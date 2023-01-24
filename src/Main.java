
import clases.Calculadora;
import clases.Persona;
import clases.Rectangulos;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        
      System.out.println(Calculadora.PI);
      
      System.out.println(Calculadora.sumar(40,50));
      
      System.out.println(PI);
        
      Persona persona1 = new Persona();
      persona1.nombre = "Renzo";
      persona1.apellido = "Qur";
      persona1.edad = 32;
      persona1.mostrarDatos();
      
      Persona persona2 = new Persona ();
      persona2.nombre = "Juan";
      persona2.apellido = "Cva";
      persona2.edad = 23;
      persona2.mostrarDatos();
      
      //Clase calculadora
      
      Calculadora calcular = new Calculadora();
        System.out.println(calcular.resta(30,50));
        System.out.println(calcular.resta(50.5,30));
        
     //Rectangulos
     Rectangulos r1 = new Rectangulos();
     System.out.println(r1.area(8,5));
     
        System.out.println(r1);
    }
    
}
