import java.util.Scanner;
public class ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[3];
        
        for (int i = 0; i < 3; i++) {
            String orden;
            if (i == 0) {
                orden = "primer";
            } else if (i == 1) {
                orden = "segundo";
            } else {
                orden = "tercero";
            }
            System.out.print("Ingrese el " + orden + " número: ");
            numeros[i] = entrada.nextInt();        
        }    
    int mayor = numeros[0];
    if (numeros[1] > mayor) {
        mayor = numeros[1];
    }
    if (numeros[2] > mayor) {
        mayor = numeros[2];
    }
    System.out.println("El número mayor es: " + mayor);
    }
}
