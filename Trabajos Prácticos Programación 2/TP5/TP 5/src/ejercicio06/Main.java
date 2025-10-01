package ejercicio06;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Azcuy", "1123456789");
        Mesa mesa = new Mesa(1,4);
        Reserva reserva = new Reserva("28/09/2025", "22:50");
        
        reserva.setCliente(cliente);
        reserva.setMesa(mesa);
        
        System.out.println("=== INFORMACIÓN DE LA RESERVA ===");
        System.out.println("Cliente: " + reserva.getCliente().getNombre());
        System.out.println("Mesa: " + reserva.getMesa().getNumero());
    }
}
