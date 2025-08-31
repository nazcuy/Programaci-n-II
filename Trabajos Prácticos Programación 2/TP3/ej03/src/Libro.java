import java.util.Scanner;
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    
    public Libro(String tit, String aut, int añoPub) {
        titulo = tit;
        autor = aut;
        setAñoPublicacion(añoPub);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }    
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    
    public void setTitulo(String tit) {
        titulo = tit;
    }    
    public void setAutor (String aut) {
        autor = aut;
    }
    public void setAñoPublicacion(int nuevoAño) {
        int añoActual = 2025;
        if (nuevoAño < 1440 || nuevoAño > añoActual) {
            System.out.println("Error: Año de publicación inválido. Debe estar entre 1440 (imprenta de Gutenberg) y " + añoActual + ".");
        } else {
            añoPublicacion = nuevoAño;
        }
    }
    
     public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion);
    }    
}
