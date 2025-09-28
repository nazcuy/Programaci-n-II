package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Norberto Galasso", "argentino");
        Libro libro = new Libro("Mariano Moreno. El sabiecito del sur", "123-456789");
        Editorial editorial = new Editorial("Colihue", "Segurola y Habana 4310, 7mo piso");
        
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Nacionalidad del autor: " + libro.getAutor().getNacionalidad());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        System.out.println("Dirección editorial: " + libro.getEditorial().getDireccion());
    }
}
