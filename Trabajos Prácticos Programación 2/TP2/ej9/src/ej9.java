import java.util.Scanner;
public class ej9 {
    
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equals("Nacional") || zona.equals("nacional")) {
            return peso * 5;
        } else if (zona.equals("Internacional") || zona.equals("internacional")) {
            return peso * 10;
        } else {
            System.out.println("Los valores ingresados no son correctos.");
            return 0;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese precio del producto: ");
        double precioProducto = entrada.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = entrada.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = entrada.next();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo del envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}
