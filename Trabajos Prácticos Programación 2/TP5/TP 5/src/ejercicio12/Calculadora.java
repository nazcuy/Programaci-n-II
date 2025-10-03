package ejercicio12;

public class Calculadora {
    public void calcular(Impuesto impuesto) {
        System.out.println("Nombre: " + impuesto.getContribuyente().getNombre());
        System.out.println("Monto: $" + impuesto.getMonto());
    }
}
