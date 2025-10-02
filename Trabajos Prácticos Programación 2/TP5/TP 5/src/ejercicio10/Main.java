package ejercicio10;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456", 50000.0, "ABC123", "02/10/2025");
        Titular titular = new Titular("Nicolás Azcuy", "12345678");

        cuenta.setTitular(titular);
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
        System.out.println("Código de seguridad: " + cuenta.getClave().getCodigo());
    }
}
