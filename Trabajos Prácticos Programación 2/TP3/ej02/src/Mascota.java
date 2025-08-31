import java.util.Scanner;
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota(String nom, String esp, int ed) {
        nombre = nom;
        especie = esp;
        edad = ed;        
    }
    
    public void mostrarInfo(){
        System.out.println("Información de la mascota: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
    
    public void cumplirAnios() {
        edad++;
    }
}
