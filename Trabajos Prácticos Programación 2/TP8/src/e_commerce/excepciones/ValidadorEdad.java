package e_commerce.excepciones;

public class ValidadorEdad {
    public static void validar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        System.out.println("Edad válida: " + edad);
    }
    
    public static void main(String[] args) {
        try {
            validar(25);
            validar(-5);            
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
