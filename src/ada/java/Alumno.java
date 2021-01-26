package ada.java;

import java.util.List;

public class Alumno extends Persona{
    private Examen examen;

    public Alumno(String nombre, String dni, List<Asignatura> asignaturas) {
        super(nombre, dni, asignaturas);
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }
}
