package ej3;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
        }
    }
    public void eliminarCurso(Curso curso) {
        if (cursos.remove(curso)) {
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
        }
    }
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor " + nombre + " no dicta ningún curso.");
            return;
        }
        System.out.println("Cursos dictados por " + nombre + ":");
        for (Curso curso : cursos) {
            System.out.println("- " + curso.getNombre() + " (" + curso.getCodigo() + ")");
        }
    }
    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cursos dictados: " + cursos.size());
        System.out.println("-----------------------------");
    }
    public String getId() { 
        return id; 
    }
    public String getNombre() {
        return nombre; 
    }
    public String getEspecialidad() { 
        return especialidad;
    }
    public List<Curso> getCursos() {
        return cursos; 
    }
}
