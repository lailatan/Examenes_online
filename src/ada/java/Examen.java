package ada.java;

import java.util.List;

public class Examen {
    private Double nota;
    private Docente docente;
    private List<Consigna> consignas;

    public Examen(Docente docente, List<Consigna> consignas) {
        this.docente = docente;
        this.consignas = consignas;
        nota=null;
    }

    public Double getNota() {
        return nota;
    }

    public Docente getDocente() {
        return docente;
    }

    public List<Consigna> getConsignas() {
        return consignas;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void mostrarDatos(){
        System.out.println("----------------------------------------------");
        System.out.println("Examen del docente: " + docente.getNombre());
        System.out.println("----------------------------------------------");
        System.out.println("Consignas: ");
        for (Consigna c: consignas)
            c.mostrarDatos();
        System.out.println("----------------------------------------------");
        System.out.println("Nota Final: " +
                ((nota==null)? "Sin evaluar":nota));

    }
}
