package ej2;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("-----------------------------");
    }
    public String getIsbn() { 
        return isbn; 
    }
    public String getTitulo() { 
        return titulo; 
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public Autor getAutor() {
        return autor; 
    }
}
