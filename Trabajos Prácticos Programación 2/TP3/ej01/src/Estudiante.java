import java.util.Scanner;
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    public Estudiante(String nom, String apell, String curs, Double calif) {
        nombre = nom;
        apellido = apell;
        curso = curs;
        calificacion = calif;
}
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación actual: " + calificacion);
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("La nota actualizada es: " + calificacion);
    }
    
        public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("La nota bajó a: " + calificacion);
    }
}
