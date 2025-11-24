package e_commerce.excepciones;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {
    public static void main(String[] args) {
        crearArchivoPrueba();
        leerArchivo("archivo_prueba.txt");
        System.out.println("\n--- Intentando leer archivo INEXISTENTE ---");
        leerArchivo("archivo_inexistente.txt");
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        Scanner scanner = null;
        
        try {
            scanner = new Scanner(archivo);
            System.out.println("Contenido de '" + nombreArchivo + "':");
            
            int contador = 0;
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                contador++;
                System.out.println(contador + ": " + linea);
            }
            
            System.out.println("Archivo leído completamente (" + contador + " líneas)");
            
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: Archivo no encontrado - " + nombreArchivo);
            System.out.println("Ruta: " + archivo.getAbsolutePath());
        } 
    }

    public static void crearArchivoPrueba() {
        try {
            java.io.FileWriter escrito = new java.io.FileWriter("archivo_prueba.txt");
            escrito.write("Línea 1: Este es un archivo de prueba\n");
            escrito.write("Línea 2: Creado para el ejercicio de lectura\n");
            escrito.write("Línea 3: Manejo de FileNotFoundException\n");
            escrito.close();
            System.out.println("Archivo de prueba creado: archivo_prueba.txt");
        } catch (java.io.IOException e) {
            System.out.println("Error creando archivo de prueba: " + e.getMessage());
        }
    }
}