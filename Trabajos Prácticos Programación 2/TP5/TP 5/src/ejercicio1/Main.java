package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Nicolás Azcuy", "12345678A");
        
        Pasaporte pasaporte = new Pasaporte("AB123456", "2023-10-01", "foto4x4.jpg", "JPEG");
        pasaporte.setTitular(titular);
        
        System.out.println("Titular del pasaporte: " + pasaporte.getTitular().getNombre());
        System.out.println("Pasaporte del titular: " + titular.getPasaporte().getNumero());
    }
}