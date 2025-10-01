package ejercicio04;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Provincia","20-12345678-3");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("789456","09-03-1988");
        tarjeta.setBanco(banco);
        Cliente cliente = new Cliente("Azcuy", "12345678",tarjeta);
        
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta: " + cliente.getTarjetaDeCredito().getNumero());
        System.out.println("Banco: " + cliente.getTarjetaDeCredito().getBanco().getNombre());

    }
}
