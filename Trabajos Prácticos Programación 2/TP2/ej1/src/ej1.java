import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = entrada.nextInt();
        
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.print("El año " + anio + " es bisiesto.");
        } else {
            System.out.print("El año " + anio + " no es bisiesto.");
        }
    }
}