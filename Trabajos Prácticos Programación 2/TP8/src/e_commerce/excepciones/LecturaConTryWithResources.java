package e_commerce.excepciones;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LecturaConTryWithResources {
    public static void main(String[] args) {
        crearArchivoPrueba();
        leerConTryWithResources("archivo_prueba.txt");
        leerConTryCatchFinally("archivo_prueba.txt");
        leerConTryWithResources("archivo_que_no_existe.txt");
    }

    public static void leerConTryWithResources(String nombreArchivo) {
        System.out.println("Leyendo: " + nombreArchivo);

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            int numeroLinea = 1;
            
            while ((linea = br.readLine()) != null) {
                System.out.println(numeroLinea + ": " + linea);
                numeroLinea++;
            }
            
            System.out.println("Lectura completa");
            
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
    public static void leerConTryCatchFinally(String nombreArchivo) {
        System.out.println("Leyendo: " + nombreArchivo);
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println("> " + linea);
            }
            System.out.println("Lectura completa");
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                    System.out.println("Recurso cerrado manualmente");
                } catch (IOException e) {
                    System.out.println("Error cerrando el recurso: " + e.getMessage());
                }
            }
        }
    }
    
    public static void crearArchivoPrueba() {
        try (java.io.FileWriter writer = new java.io.FileWriter("archivo_prueba.txt")) {
            writer.write("Línea: Prueba de try-with-resources\n");
            System.out.println("Archivo de prueba creado");
        } catch (IOException e) {
            System.out.println("Error creando archivo: " + e.getMessage());
        }
    }
}
