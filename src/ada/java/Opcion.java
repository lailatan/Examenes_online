package ada.java;

public class Opcion {
    private Integer numero;
    private String descripcion;
    private Boolean esCorrecta;

    public Opcion(Integer numero, String descripcion, Boolean esCorrecta) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.esCorrecta = esCorrecta;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Boolean getEsCorrecta() {
        return esCorrecta;
    }

    public void mostrarDatos(){
        System.out.println(numero + ". " + descripcion);
    }
}
