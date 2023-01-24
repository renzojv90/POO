
package herencia;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fecharRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fecharRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fecharRegistro = fecharRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }


    public Date getFecharRegistro() {
        return this.fecharRegistro;
    }

    public void setFecharRegistro(Date fecharRegistro) {
        this.fecharRegistro = fecharRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + "Es vip: " + this.vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fecharRegistro=").append(fecharRegistro); 
        sb.append(", vip=").append(vip);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    
}
