import java.util.Scanner;
public class ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolecente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else if (edad >= 60) {
            System.out.println("Eres un Adulto mayor.");
        }
    }
}
