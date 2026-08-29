package ejercicio;

import java.util.ArrayList;

public class Estudiante extends Persona {

    private static int totalEstudiantes = 0;

    private ArrayList<Curso> cursos;

    public Estudiante(int id, String nombre) {
        super(id, nombre);
        this.cursos = new ArrayList<>();
        totalEstudiantes++;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    public void inscribirCurso(Curso curso) {
        cursos.add(curso);
        curso.agregarEstudiante(this);
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public String getRol() {
        return "Estudiante";
    }
}
