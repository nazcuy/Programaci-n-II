package ejercicio05;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("HP", "123456789", "P1945", "AMD");
        Propietario propietario = new Propietario("Azcuy", "12345678");
        
        computadora.setPropietario(propietario);
        
        System.out.println("=== INFORMACIÓN DE LA COMPUTADORA ===");
        System.out.println(computadora.getMarca() + " " + computadora.getNumeroSerie());
        System.out.println(computadora.getPlacaMadre().getModelo() + " " + computadora.getPlacaMadre().getChipset());
 
        System.out.println("\n=== INFORMACIÓN DEL PROPIETARIO ===");
        System.out.println(propietario.getNombre() + " " + propietario.getDni());
    }
}
