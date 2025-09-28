package ejercicio4;
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;
    
    public Cliente(String nombre,String dni,TarjetaDeCredito tarjeta){
        this.nombre = nombre;
        this.dni = dni;
        this.tarjeta = tarjeta;
    }
    public String getNombre() {
        return nombre; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni; 
    }
    public void setDni(String dni) {
        this.dni = dni; 
    }
    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjeta; 
    }
    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        if(this.tarjeta == tarjeta) {
            return;
        }
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente()!= this)
            tarjeta.setCliente(this);
    }
}
