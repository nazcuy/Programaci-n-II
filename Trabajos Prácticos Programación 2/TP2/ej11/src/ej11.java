import java.util.Scanner;
public class ej11 {
    static double porcentajeDescuento = 0.10;
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * porcentajeDescuento;
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();
        calcularDescuentoEspecial(precio);
    }
}
