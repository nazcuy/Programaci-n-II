package ejercicio13;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nico Azcuy", "nazcuy@empresa.com");
        GeneradorQR generador = new GeneradorQR();
        
        generador.generar("987654321", usuario);
    }
}
