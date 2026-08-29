package ejercicio;

public abstract class Persona {

    protected int id;
    protected String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getRol();

    public String toString() {
        return getRol() + ": id=" + id + ", nombre=" + nombre;
    }
}
