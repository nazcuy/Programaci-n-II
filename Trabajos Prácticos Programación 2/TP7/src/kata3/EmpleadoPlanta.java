package kata3;

public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonificacion;
    private int anosAntiguedad;

    public EmpleadoPlanta(String nombre, String id, double sueldoBase, double bonificacion, int anosAntiguedad) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.anosAntiguedad = anosAntiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoBase + bonificacion + (sueldoBase * 0.01 * anosAntiguedad);
    }

    public double getSueldoBase() {
        return sueldoBase;
    }
    public double getBonificacion() {
        return bonificacion;
    }
    public int getAnosAntiguedad() {
        return anosAntiguedad;
    }
}
