package e_commerce.excepciones;

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    public EdadInvalidaException() {
        super("La edad proporcionada no es válida");
    }
}
