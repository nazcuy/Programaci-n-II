package kata3;

public class EmpleadoTemporal extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String id, double salarioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo() {
        return salarioPorHora * horasTrabajadas;
    }
    public double getSalarioPorHora() {
        return salarioPorHora;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
