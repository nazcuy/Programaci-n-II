package e_commerce.excepciones;
import java.util.Scanner;

public class ConversionSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto para convertir a número: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Conversión exitosa: '" + texto + "' -> " + numero);

        } catch (NumberFormatException e) {
            System.out.println("ERROR: No se puede convertir '" + texto + "' a número entero.");
            System.out.println("El texto debe contener solo dígitos numéricos.");
        }
    }
}
