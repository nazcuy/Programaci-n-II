import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el precio del producto: ");
        double precioSinDescuento = entrada.nextDouble();
        System.out.print("Ingrese categoría A, B o C: ");
        String categoria = entrada.next();
        double descuento = 0;
        
        if (categoria.equals("A") || categoria.equals("a")) {
            descuento = 0.10;
        } else if (categoria.equals("B") || categoria.equals("b")) {
            descuento = 0.15;
        } else if (categoria.equals("C") || categoria.equals("c")) {
            descuento = 0.20;
        } else {
            System.out.println("Categoría inválida.");
        }
        
        double precioConDescuento = precioSinDescuento - (precioSinDescuento * descuento);
        System.out.println("El precio original es: $" + precioSinDescuento);
        System.out.println("El descuento aplicado es: " + (descuento * 100) + "%");
        System.out.println("El precio final es: $" + precioConDescuento);
    }
}
