package ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Pedro Aznar", "Rock");
        Cancion cancion = new Cancion("Como dos extraños", artista);
        
        Reproductor reproductor = new Reproductor();
        
         System.out.println("=== REPRODUCIENDO CANCIÓN ===");
        reproductor.reproducir(cancion);
    }
}
