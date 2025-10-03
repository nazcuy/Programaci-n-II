package ejercicio12;

public class Main {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Nicolás Azcuy", "20-12345678-9");
        Impuesto impuesto = new Impuesto(50000.0, contribuyente);
        Calculadora calculadora = new Calculadora();
        
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        calculadora.calcular(impuesto); 
    }
}
