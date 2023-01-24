package clases;


public class Persona {
    public String nombre;
    public String apellido;
    public int edad;
    
    public Persona(){
        System.out.println("Construyendo persona...");
    }
    
    public Persona(String nombre){
        System.out.println("Hola " + nombre + " desde el constructor");
    }
    
    public void mostrarDatos(){
        System.out.println("Nombrecompleto: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
    }
}
