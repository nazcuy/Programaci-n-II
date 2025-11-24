package e_commerce;

public class PayPal implements PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }
    @Override
    public double aplicarDescuento(double monto, double porcentajeDescuento) {
        double descuento = monto * (porcentajeDescuento / 100);
        System.out.println("Aplicando descuento de $" + descuento + " al pago de PayPal");
        return monto - descuento;
    }
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal: " + email);
        return true;
    }
}
