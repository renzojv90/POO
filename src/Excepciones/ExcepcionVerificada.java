
package Excepciones;
import java.io.*;

public class ExcepcionVerificada {
    public static void main(String[] args){
        readFile1();
    }
    
    public static void readFile1(){
        File file = new File("C://file.txt");
        try{
            FileReader fr =new FileReader(file);
        }catch(FileNotFoundException ex){
            System.out.println("El archivo no se puede leer");
            ex.printStackTrace(System.out);
        }
    }
}
