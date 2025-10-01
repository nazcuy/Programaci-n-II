package ejercicio07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Motor getMotor() {
        return motor; 
    }
    public void setMotor(Motor motor) { 
        this.motor = motor;
    }
    public Conductor getConductor() {
        return conductor; 
    }
    public void setConductor(Conductor conductor) {
        if (this.conductor == conductor) {
            return;
        }
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
}
