package kata2;

public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularArea();
    
    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DE LA FIGURA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
    }
    public String getNombre(){
        return nombre;
    }
}
