import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("REGISTRO DE LIBRO");
        System.out.println("Ingrese el título del libro: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = entrada.nextLine();
        System.out.println("Ingrese año de la publicación: ");
        int añoPublicacion = entrada.nextInt();
        
        Libro libro1 = new Libro(titulo, autor, añoPublicacion);
        
        libro1.mostrarInfo();
        
    }
}