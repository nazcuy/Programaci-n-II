package kata3;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Nicolás Azcuy", "EP-001", 300000, 50, 7));
        empleados.add(new EmpleadoPlanta("Juan Fidel", "EP-022", 500000, 1, 2));
        empleados.add(new EmpleadoTemporal("Carlos López", "TEMP-001", 2500, 160));
        empleados.add(new EmpleadoTemporal("Ana Martínez", "TEMP-002", 3000, 120));

        System.out.println("=== CALCULO DE SUELDOS ===\n");

        double totalSueldos = 0;
        int contadorPlanta = 0;
        int contadorTemporal = 0;

        for (Empleado empleado : empleados) {
            empleado.mostrarInfo();
            double sueldo = empleado.calcularSueldo();
            totalSueldos += sueldo;

            if (empleado instanceof EmpleadoPlanta) {
                contadorPlanta++;
                System.out.println("Tipo: Empleado de Planta");
                EmpleadoPlanta planta = (EmpleadoPlanta) empleado;
                System.out.println("Años de antigüedad: " + planta.getAnosAntiguedad());
                System.out.println("------------------------------");
            } else if (empleado instanceof EmpleadoTemporal) {
                contadorTemporal++;
                System.out.println("Tipo: Empleado Temporal");
                EmpleadoTemporal temporal = (EmpleadoTemporal) empleado;
                System.out.println("Horas trabajadas: " + temporal.getHorasTrabajadas());
                System.out.println("------------------------------");
            }
        }
    }
}
