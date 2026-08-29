package ejercicio;

public class Profesor extends Persona {

    private static int totalProfesores = 0;

    private String especialidad;

    public Profesor(int id, String nombre, String especialidad) {
        super(id, nombre);
        this.especialidad = especialidad;
        totalProfesores++;
    }

    public static int getTotalProfesores() {
        return totalProfesores;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getRol() {
        return "Profesor";
    }
}
