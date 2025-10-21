package ej1;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        Producto p1 = new Producto("A001", "Arroz integral", 500, 100, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E001", "Arduino UNO", 25000, 50, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R001", "Camisa cuello chino", 1500, 75, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H001", "Sartén sin mango", 2000, 30, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A002", "Leche condensada", 300, 200, CategoriaProducto.ALIMENTOS);
        
        // 1. Agregar productos
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        System.out.println("\n");
        
        // 2. Listar los productos
        inventario.listarProductos();
        System.out.println("\n");
        
        // 3. Buscar producto por ID
        System.out.println("=== BUSCAR PRODUCTO POR ID ===");
        Producto encontrado = inventario.buscarProductoPorId("E001");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        System.out.println("\n");
        
        // 4. Filtrar por categoría
        System.out.println("=== FILTRAR POR CATEGORÍA (ALIMENTOS) ===");
        List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        for (Producto alimento : alimentos) {
            alimento.mostrarInfo();
        }
        System.out.println("\n");
        
        // 5. Eliminar producto
        System.out.println("=== ELIMINAR PRODUCTO ===");
        inventario.eliminarProducto("R001");
        System.out.println("\n");
        
        // 6. Actualizar stock
        System.out.println("=== ACTUALIZAR STOCK ===");
        inventario.actualizarStock("A001", 150);
        System.out.println("\n");
        
        // 7. Mostrar total de stock
        System.out.println("=== MOSTRAR STOCK ===");
        System.out.println("Total de stock: " + inventario.obtenerTotalStock());
        System.out.println("\n");
        
        // 8. Producto con mayor stock
        System.out.println("=== MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("Producto con mayor stock: " + mayorStock.getNombre());
        }
        
        // 9. Filtrar por precio
        System.out.println("=== PRODUCTOS ENTRE $1000 Y $3000 ===");
        List<Producto> porPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        for (Producto producto : porPrecio) {
            producto.mostrarInfo();
        }
        System.out.println("\n");
        
        // 10. Mostrar categorías
        inventario.mostrarCategoriasDisponibles();
    }
}
