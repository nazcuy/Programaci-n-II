import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = entrada.nextLine();        
        System.out.println("Ingrese apellido: ");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese curso: ");
        String curso = entrada.nextLine();
        System.out.println("Ingrese la calificación actual: ");
        Double notaActual = entrada.nextDouble();
                
        Estudiante estudiante1 = new Estudiante(nombre, apellido, curso, notaActual);
        estudiante1.mostrarInfo();

        System.out.println("\n¿Qué desea hacer?");
        System.out.println("1 - Subir calificación");
        System.out.println("2 - Bajar calificación");
        System.out.print("Elija una opción (1/2): ");
        int opcion = entrada.nextInt();
        
        System.out.print("Ingrese los puntos: ");
        double puntos = entrada.nextDouble();
        
        if (opcion == 1) {
            estudiante1.subirCalificacion(puntos);
        } else if (opcion == 2) {
            estudiante1.bajarCalificacion(puntos);
        } else {
            System.out.println("Opción no válida.");
        }
        
    }  
}
