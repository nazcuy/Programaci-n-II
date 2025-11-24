package e_commerce;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Cliente cliente;
    private String estado;
    
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "PENDIENTE";
    }
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.notificar("El estado de su pedido ha cambiado a: " + nuevoEstado);
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
}
