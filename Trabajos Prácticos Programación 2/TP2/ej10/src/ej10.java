import java.util.Scanner;
public class ej10 {
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
            return stockActual - cantidadVendida + cantidadRecibida;
        }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = entrada.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = entrada.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = entrada.nextInt();
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);               
                
    } 
}
