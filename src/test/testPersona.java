
package test;

import encapsulamiento. *;
public class testPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Renzo",32,false);
        
        persona1.setNombre("Joaquin");
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        
        System.out.println(persona1.getNombre());
        
    }
}
