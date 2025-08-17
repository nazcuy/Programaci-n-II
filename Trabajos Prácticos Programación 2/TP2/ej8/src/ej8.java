import java.util.Scanner;
public class ej8 {
    
    static double precioBase;
    
    public static double calcularPrecioFinal(double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * (impuesto / 100)) - (precioBase  * (descuento / 100));
        return precioFinal;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indique cuál es el precio base del producto: ");
        precioBase = entrada.nextDouble();
        System.out.println("Ingrese el impuesto en porcentaje: ");
        double impuesto = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = entrada.nextDouble();
        
        double precioFinal = calcularPrecioFinal(impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);
    }
}
