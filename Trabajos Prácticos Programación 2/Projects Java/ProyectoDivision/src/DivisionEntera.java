import java.util.Scanner;

public class DivisionEntera {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresá el primer número entero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Ingresá el segundo número entero: ");
        int num2 = entrada.nextInt();
        
        if (num2 != 0) {
            int resultado = num1/num2;
            System.out.println("Resultado de la división entera: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }
}
