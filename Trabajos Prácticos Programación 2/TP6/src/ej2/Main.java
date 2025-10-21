package ej2;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear al menos tres autores
        Autor autor1 = new Autor("A001", "Li Dazhao", "Chino");
        Autor autor2 = new Autor("A002", "Vladimir Lenin", "Ruso");
        Autor autor3 = new Autor("A003", "Juan Domingo Perón", "Argentino");
        
        // 3. Agregar 5 libros asociados a alguno de los autores a la biblioteca.
        biblioteca.agregarLibro("ISBN001", "La nueva juventud", 1915, autor1);
        biblioteca.agregarLibro("ISBN002", "Tesis de abril", 1917, autor2);
        biblioteca.agregarLibro("ISBN003", "La comunidad organizada", 1963, autor3);
        biblioteca.agregarLibro("ISBN004", "El Estado y la revolución", 1917, autor2);
        biblioteca.agregarLibro("ISBN005", "La enfermedad infantil del izquierdismo en el comunismo", 1920, autor2);
        System.out.println("\n");
        
        // 4. Listar todos los libros.
        biblioteca.listarLibros();
        System.out.println("\n");
        
        // 5. Buscar un libro por su ISBN y mostrar su información.
        System.out.println("=== BUSCAR LIBRO POR ISBN ===");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        System.out.println("\n");
        
        // 6. Filtrar y mostrar los libros publicados en 1917.
        System.out.println("=== FILTRAR LIBROS POR AÑO 1917 ===");
        List<Libro> libros1949 = biblioteca.filtrarLibrosPorAnio(1917);
        for (Libro libro : libros1949) {
            libro.mostrarInfo();
        }
        System.out.println("\n");
        
        // 7. Eliminar un libro por ISBN y listar los libros restantes.
        biblioteca.eliminarLibro("ISBN002");
        System.out.println("--- Libros después de eliminar ---");
        biblioteca.listarLibros();
        System.out.println("\n");
        
        // 8. Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("Cantidad total de libros: " + biblioteca.obtenerCantidadLibros());
        System.out.println("\n");
        
        // 9. Listar todos los autores de los libros disponibles en la biblioteca.
        biblioteca.mostrarAutoresDisponibles();
    }
}
