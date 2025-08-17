import java.util.Scanner;
public class ej12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};   
        System.out.println("Precios originales: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
        System.out.print("Ingrese el precio a modificar: ");
        double precioViejo = entrada.nextDouble();
        System.out.print("Ingrese el nuevo precio: ");
        double precioNuevo = entrada.nextDouble();
        
        boolean precioEncontrado = false;
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] == precioViejo) {
                precios[i] = precioNuevo;
                precioEncontrado = true;
                break;
            }
        }
        if (precioEncontrado == false) {
            System.out.println("El precio ingresado no se encontró entre los precios.");
        }
        System.out.println("Precios Modificados: ");
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
