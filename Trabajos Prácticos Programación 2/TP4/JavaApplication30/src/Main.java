public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Nicolás Azcuy", "Programador", 500000);
        Empleado emp2 = new Empleado("Tania Sitkov", "Fotógrafa");
        Empleado emp3 = new Empleado("Juan Fidel", "Ingeniero");
        
        System.out.println("Empleados de la startup");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        emp1.actualizarSalario(10.0);
        emp2.actualizarSalario(20000);
        emp3.actualizarSalario(50.5);
        
        System.out.println("\nNuevos salarios de los empleados después del aumento");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        System.out.println("\nNombre del segundo empleado: " + emp2.getNombre());
        emp2.setNombre("Tania Nair Sitkov");
        System.out.println("\nNombre modificado del segundo empleado: " + emp2.getNombre());
        
        System.out.println("\nTotal de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
