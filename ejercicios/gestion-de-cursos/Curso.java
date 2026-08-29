package ejercicio;

import java.util.ArrayList;

public class Curso {

    public static final int MAX_ESTUDIANTES = 30;

    private String codigo;
    private String nombre;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String codigo, String nombre, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < MAX_ESTUDIANTES) {
            estudiantes.add(estudiante);
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public int getNumEstudiantes() {
        return estudiantes.size();
    }

    public String toString() {
        return "Curso: " + codigo + " - " + nombre +
                ", profesor=" + profesor.getNombre() +
                ", inscritos=" + estudiantes.size();
    }
}
