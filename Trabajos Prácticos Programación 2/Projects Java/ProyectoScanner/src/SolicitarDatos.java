import java.util.Scanner;

public class SolicitarDatos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
