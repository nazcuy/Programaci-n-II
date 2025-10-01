package ejercicio07;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "123456789");
        Conductor conductor = new Conductor("Azcuy", "P1945");
        Vehiculo vehiculo = new Vehiculo("ABC123", "Torino");
        
        vehiculo.setMotor(motor);
        vehiculo.setConductor(conductor);
        
        System.out.println("=== INFORMACIÓN DEL VEHÍCULO ===");
        System.out.println("Conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehículo: " + conductor.getVehiculo().getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
    }
}
