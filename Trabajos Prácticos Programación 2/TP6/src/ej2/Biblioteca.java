package ej2;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado: " + titulo);
    }
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("=== LISTA DE LIBROS ===");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    public boolean eliminarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro != null) {
            libros.remove(libro);
            System.out.println("Libro eliminado: " + libro.getTitulo());
            return true;
        }
        System.out.println("Libro con ISBN " + isbn + " no encontrado.");
        return false;
    }
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> resultado = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    public void mostrarAutoresDisponibles() {
        System.out.println("=== AUTORES DISPONIBLES ===");
        List<Autor> autoresVistos = new ArrayList<>();
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!autoresVistos.contains(autor)) {
                autoresVistos.add(autor);
                autor.mostrarInfo();
            }
        }
    }
}
