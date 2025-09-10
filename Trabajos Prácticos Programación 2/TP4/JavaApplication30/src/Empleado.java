public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        totalEmpleados++;
        this.id = totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 317800.0;
    }
    
    public void actualizarSalario(double porcentajeAumento) {
        this.salario += this.salario * (porcentajeAumento / 100);
    }
    
    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }
    
    @Override
    public String toString() {
        return "Empleado -> ID: " + id + " - Nombre: " + nombre + " - Puesto: " + puesto + " - Salario: " + salario;
    }
    
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) { 
        this.puesto = puesto; 
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) { 
        this.salario = salario; 
    }
}
