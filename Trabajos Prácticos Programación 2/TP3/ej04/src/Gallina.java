import java.util.Scanner;
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public Gallina(int id, int eda) {
        idGallina = id;
        edad = eda;
        huevosPuestos = 0;
    }
    public void ponerHuevo() {
        if (edad > 1) {
            int añosProductivos = edad -1;
            huevosPuestos = añosProductivos * 365;
        } else {
            huevosPuestos = 0;
            System.out.println("La gallina " + idGallina + " es demasiado joven para poner huevos.");
        }
    }   
    public void envejecer(int años) {
        edad+= años;
    }
    public void mostrarEstado() {
        System.out.println("ESTADO DE LA GALLINA: " + idGallina);
        System.out.println("Edad: " + edad);
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------");
    }
    public int getEdad() {
        return edad;
    }
    
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    
    public int getIdGallina() {
        return idGallina;
    }
}
