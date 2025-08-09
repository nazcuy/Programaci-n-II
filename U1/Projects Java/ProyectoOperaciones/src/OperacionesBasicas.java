import java.util.Scanner;

public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresá el primer número entero: ");
        int num1 = entrada.nextInt();
        System.out.print("Ingresá el segundo número entero: ");
        int num2 = entrada.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        if (num2 != 0) {
            double division = (double) num1 / num2;
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicacion);
            System.out.println("División: " + division);
            
        } else {
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicacion: " + multiplicacion);
            System.out.println("División: No se puede dividir por cero.");
        }
    }
}
