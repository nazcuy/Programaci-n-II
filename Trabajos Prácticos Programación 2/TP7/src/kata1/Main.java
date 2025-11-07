package kata1;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Ford", "F100");
        vehiculo1.mostrarInfo();
        System.out.println();
        
        Auto miAuto = new Auto("Chevrolet", "Agile", 5);
        miAuto.mostrarInfo();
        System.out.println();
    }
}
