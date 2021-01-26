package ada.java;

import java.util.List;

public abstract class Persona {
    private String nombre;
    private String dni;
    private List<Asignatura> asignaturas;

    public Persona(String nombre, String dni, List<Asignatura> asignaturas) {
        this.nombre = nombre;
        this.dni = dni;
        this.asignaturas = asignaturas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
