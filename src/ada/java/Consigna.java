package ada.java;

import java.util.ArrayList;
import java.util.List;

public class Consigna {
    private Integer numero;
    private Boolean esMultipleChoice;
    private String pregunta;
    private List<Opcion> opciones;

    public Consigna(Integer numero, String pregunta) {
        this.numero = numero;
        this.pregunta = pregunta;
        this.esMultipleChoice = false;
        opciones = null;
    }

    public Consigna(Integer numero, String pregunta, List<Opcion> opciones) {
        this.numero = numero;
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.esMultipleChoice = true;
        opciones = new ArrayList<>();
    }

    public Integer getNumero() {
        return numero;
    }

    public Boolean getEsMultipleChoice() {
        return esMultipleChoice;
    }

    public String getPregunta() {
        return pregunta;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void mostrarDatos() {
        Integer respuestaCorrecta=0;

        System.out.println(numero + "- " + pregunta);
        if (esMultipleChoice){
            for (Opcion o: opciones){
                if (o.getEsCorrecta())  respuestaCorrecta=o.getNumero();
                System.out.print("    ");
                o.mostrarDatos();
            }
            System.out.print("    ");
            System.out.println("La respuesta correcta es: " + respuestaCorrecta);
        }
    }
}
