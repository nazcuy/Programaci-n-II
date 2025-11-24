package e_commerce.excepciones;
import java.util.Scanner;
public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese el dividendo: ");
            int dividendo = scanner.nextInt();
            
            System.out.print("Ingrese el divisor: ");
            int divisor = scanner.nextInt();
            
            int resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero!");
            System.out.println("Mensaje de error: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
    
    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return (double) a / b;
    }
}
