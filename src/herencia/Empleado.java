
package herencia;

public class Empleado extends Persona {
    private int idEmpleados;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(double sueldo, String nombre) {
        super(nombre);
        this.idEmpleados = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleados() {
        return this.idEmpleados;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
        public String obtenerDetalle(){
            return super.obtenerDetalle()+ "Sueldo: " + this.sueldo;
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleados=").append(this.idEmpleados);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
    
}
