package ejercicio9;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Nicolás", "IOMA");
        Profesional profesional = new Profesional("Dr. Cardozo", "Cardiología");
        CitaMedica cita = new CitaMedica("01/10/2025", "20:40");
        
        cita.setPaciente(paciente);
        cita.setProfesional(profesional);
        
        System.out.println("=== INFORMACIÓN DE LA CITA MÉDICA ===");
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Obra Social: " + cita.getPaciente().getObraSocial());
    }
}
