package ejercicio13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        System.out.println("Se creó CodigoQR con valor: " + codigoQR.getValor());
    }
}
