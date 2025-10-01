package ejercicio8;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Azcuy", "azcuy-email@email.com");
        Documento documento = new Documento("Trámite AFIP","Deuda monotributo","ABC123","01/10/2025",usuario);
        
        System.out.println("=== DOCUMENTO CON FIRMA DIGITAL ===");
        System.out.println("Firmado por: " + documento.getFirma().getUsuario().getNombre());
    }
}
