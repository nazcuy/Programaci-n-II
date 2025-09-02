import java.util.Scanner;
public class NaveEspacial {
    private String nombre;
    private int combustible;
    public NaveEspacial(String nom, int comb) {
        nombre = nom;
        combustible = comb;
    }
    public void despegar() {
        if (combustible >= 60) {
            System.out.println("El cohete " + nombre + " ha despegado correctamente!");
            combustible -= 60;
        } else {
            System.out.println("El cohete " + nombre + " no tiene combustible para despegar!");
        }
    }
    public void avanzar(int distancia){
        int combustibleNecesario = distancia * 10;
        if (combustible >= combustibleNecesario) {
            System.out.println("El cohete " + nombre + " avanzó " + distancia + " km.");
            combustible -= combustibleNecesario;
        } else {
            System.out.println("El cohete " + nombre + " no tiene combustible para avanzar " + distancia + " km.");
        }
        System.out.println("Necesita " + combustibleNecesario + " litros, pero solo tiene " + combustible + " litros.");
    }
    public void recargarCombustible(int cantidad) {
        int limiteRecarga = 1000;
        int espacioDisponible = limiteRecarga - combustible;
        if (cantidad < espacioDisponible) {
            combustible += cantidad;
            System.out.println("Recarga exitosa. Puede continuar viaje.");
        } else {
            System.out.println("Usted ya tiene el tanque lleno.");
        }
    }
    public void mostrarEstado() {
        System.out.println("=== ESTADO DE LA NAVE: " + nombre);
        System.out.println("Combustible: " + combustible + " litros.");
        System.out.println("=========================");
    }
    public String getNombre() {
        return nombre;
    }
    public int getCombustible() {
        return combustible;
    }
}
