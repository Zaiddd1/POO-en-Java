package ejercicio;

public class TestGestionCursos {

    public static void main(String[] args) {

        Profesor profesor1 = new Profesor(1, "Ana Torres", "Programacion");
        Curso curso1 = new Curso("LP3", "Lenguajes de Programacion III", profesor1);

        Estudiante estudiante1 = new Estudiante(101, "Luis Mamani");
        Estudiante estudiante2 = new Estudiante(102, "Rosa Quispe");

        estudiante1.inscribirCurso(curso1);
        estudiante2.inscribirCurso(curso1);

        System.out.println("--- DATOS DEL CURSO ---");
        System.out.println(curso1);

        System.out.println("\n--- PERSONAS INVOLUCRADAS ---");
        System.out.println(profesor1);
        System.out.println(estudiante1);
        System.out.println(estudiante2);

        System.out.println("\n--- CONTADORES DE CLASE ---");
        System.out.println("Total profesores: " + Profesor.getTotalProfesores());
        System.out.println("Total estudiantes: " + Estudiante.getTotalEstudiantes());

        System.out.println("\n--- CONSTANTE ---");
        System.out.println("Cupo maximo por curso: " + Curso.MAX_ESTUDIANTES);
    }
}
