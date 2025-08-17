import java.util.Scanner;
public class ej5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número (0 para terminar): ");
        int numero = entrada.nextInt();
        int suma = 0;
        
        while(numero != 0) {
            if (numero % 2 == 0) {
                suma += numero;
            }
            System.out.println("Ingrese un número (0 para terminar): ");
            numero = entrada.nextInt();            
        }
        System.out.println("La suma de los números pares es: " + suma);    
    }
    
}
