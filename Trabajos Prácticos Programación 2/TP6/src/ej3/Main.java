package ej3;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad Tecnológica Nacional");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor prof1 = new Profesor("P001", "Carlos Cimino", "Programación");
        Profesor prof2 = new Profesor("P002", "Maxi Programa", "Base de Datos");
        Profesor prof3 = new Profesor("P003", "Brais Moure", "Sistemas Informáticos");

        Curso curso1 = new Curso("C001", "Programación 1");
        Curso curso2 = new Curso("C002", "Análisis de datos");
        Curso curso3 = new Curso("C003", "Programación 2");
        Curso curso4 = new Curso("C004", "Arquitectura y Sistemas Operativos");
        Curso curso5 = new Curso("C005", "Estructuras de Datos");

        // 2. Agregar profesores y cursos a la universidad.
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);

        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);

        System.out.println("\n");

        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...)
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P002");
        universidad.asignarProfesorACurso("C003", "P001");
        universidad.asignarProfesorACurso("C004", "P003");
        universidad.asignarProfesorACurso("C005", "P002");

        System.out.println("\n");

        // 4. Listar cursos con su profesor y profesores con sus cursos
        System.out.println("=== CURSOS CON SU PROFESOR ===");
        universidad.listarCursos();

        System.out.println("\n=== PROFESORES CON SUS CURSOS ===");
        universidad.listarProfesores();

        System.out.println("\n");

        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("=== CAMBIAR PROFESOR ===");
        universidad.asignarProfesorACurso("C001", "P002");

        System.out.println("\n--- Verificación ---");
        curso1.mostrarInfo();
        prof1.listarCursos();
        prof2.listarCursos();

        System.out.println("\n");
 
        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("=== ELIMINAR CURSO ===");
        universidad.eliminarCurso("C002");

        System.out.println("\n--- Verificación en profesor Maxi Programa ---");
        prof2.listarCursos();

        System.out.println("\n");

        // 7. Remover un profesor y dejar profesor = null
        System.out.println("=== ELIMINAR PROFESOR ===");
        universidad.eliminarProfesor("P003");

        System.out.println("\n--- Verificación cursos de Brais ---");
        curso4.mostrarInfo();

        System.out.println("\n");

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        universidad.mostrarReporteCursosPorProfesor();
    }
}
