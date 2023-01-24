
package test;
import herencia.*;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Renzo", 'M', 25,"Villa la Angostura");
        
        System.out.println(persona1);
        
        Empleado empleado1 = new Empleado(300,"Pedro");
        System.out.println(empleado1);
        
        Empleado empleado2 = new Empleado(500,"Juan");
        System.out.println(empleado2);
        
        Empleado empleado3 = new Empleado(800,"Lola");
        System.out.println(empleado3);
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Dante", 'M',25, "Neuquen");
        System.out.println(cliente1);
        
        
        Persona persona = new Persona("Joaquin", 'M', 35,"Villa la Angostura");
        imprimer(persona);
        
        determinarTipo(persona);
        
        
        //Conversion de objeto
        //Downcasting de clase padre a hija
        Persona persona2 = new Empleado (300,"Pedro");
        Empleado empleado4 = (Empleado) persona2;
        System.out.println(empleado4.obtenerDetalle());
        
        
        //Upcasting de clase hija a padre
    
        Persona persona3 = empleado4;
        System.out.println(persona3.obtenerDetalle());
        
        Persona p1 = new Persona("Renzo", 'M', 25,"Villa la Angostura");
        
        Persona p2 = new Persona("Renzo", 'M', 25,"Villa la Angostura");
        
        System.out.println(p1.equals(p2));
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        if (p1.hashCode()  == p2.hashCode()){
            System.out.println("Los objetos son iguales");
        }else{
            System.out.println("Los objetos no son iguales");
        }
        
        
        }
    
        
    
    public static void imprimer(Persona persona){
        System.out.println(persona.obtenerDetalle());
    }
    
    public static void determinarTipo(Object objeto) {
        if(objeto instanceof Persona){
            System.out.println("Es de tipo Persona");
        }else if(objeto instanceof Cliente){
            System.out.println("Es de tipo Cliente");
        }else if(objeto instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if(objeto instanceof Object){
            System.out.println("Es de tipo Object");
        }
        
        
    }
    
    
    
}
