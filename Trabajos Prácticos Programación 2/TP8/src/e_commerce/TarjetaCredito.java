package e_commerce;

public class TarjetaCredito implements Pago {
    private String numeroTarjeta;
    private String titular;

    public TarjetaCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta " + numeroTarjeta);
        return true;
    }
}