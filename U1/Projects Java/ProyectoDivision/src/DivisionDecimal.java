import java.util.Scanner;

public class DivisionDecimal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresá el primer número: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Ingresá el segundo número: ");
        double num2 = entrada.nextDouble();
        
        if (num2 != 0) {
            double resultado = num1/num2;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero");
        }
    }
}
