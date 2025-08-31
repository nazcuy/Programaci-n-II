import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("REGISTRO DE MASCOTA");
        System.out.println("Ingrese el nombre de la mascota: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la especie de la mascota: ");
        String especie = entrada.nextLine();
        System.out.println("Ingrese la edad de la mascota: ");
        int edad = entrada.nextInt();
        
        Mascota mascota = new Mascota(nombre, especie, edad);
        
        mascota.mostrarInfo();
        
        System.out.println("¿Cuántos años pasaron desde el último registro?: ");
        int anios = entrada.nextInt();
        
        for (int i = 0; i < anios; i++) {
            mascota.cumplirAnios();
        }
        System.out.println("Su mascota" + nombre + " cumplió años. Ahora tiene: " + edad);
        
        mascota.mostrarInfo();
    }
}
