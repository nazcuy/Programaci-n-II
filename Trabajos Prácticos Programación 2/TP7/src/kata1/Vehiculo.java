package kata1;

public class Vehiculo {
    private String marca;
    private String modelo;
 
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
}