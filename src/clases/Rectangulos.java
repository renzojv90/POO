
package clases;

public class Rectangulos {
    public int base;
    public int altura;
    
    public Rectangulos(){
        System.out.println(base);
        System.out.println(altura);
    }

       
    public int area(int base, int altura){
        this.base = base;
        this.altura = altura;
        return this.base*this.altura;
    }
    ///this. es para referirse exclusivamente a la variable del metetodo o clase
    public int perimetro(int base, int altura){
        this.base = base;
        this.altura = altura;
        return 2*(this.base*this.altura);
    }
}
