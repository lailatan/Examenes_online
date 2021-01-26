package ada.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
2 - exámenes online
        Crear un sistema que permita asignar exámenes a alumnos.
        Alumnos y docentes tienen nombre, dni y una lista de asignaturas.
        Cada alumno tiene un examen.
        Cada examen tiene una nota.
        Cada examen conoce al docente que va a corregirlo.
        Hay exámenes multiple choice y exámenes con preguntas a desarrollar. También existen exámenes mixtos.
        Los exámenes multiple-choice tienen una lista de consignas, cada consigna con opciones que pueden ser
        correctas o incorrectas.
        Los exámenes con preguntas a desarrollar tienen una lista de consignas. No se guarda la respuesta correcta,
        el docente debe corregirlas manualmente.
*/
public class Main {

    public static void main(String[] args) {
	// write your code here
    Asignatura matematica1 = new Asignatura("M01", "Matematica 1");
    Asignatura lengua3 = new Asignatura("L03", "Lengua 3");

    Docente docente1 = new Docente("Alberto","23232232",(Arrays.asList(
            matematica1)));
    Docente docente2 = new Docente("Silvia","24343232",(Arrays.asList(
            lengua3)));

    Alumno alumno1 = new Alumno("Federico","14343232",(Arrays.asList(
                matematica1, lengua3)));

    List<Consigna> consignas_matematica1 = new ArrayList<>();
    Consigna consigna1= new Consigna(1,"Enuncie el Teorema de Pitágoras");
    consignas_matematica1.add(consigna1);
    Consigna consigna2= new Consigna(2,
            "El perimetro de un Triangulo equilatero de base 5 es: ",
            Arrays.asList(  new Opcion(1,"15",true),
                            new Opcion(2,"20",false),
                            new Opcion(3,"25",false)));
    consignas_matematica1.add(consigna2);

    alumno1.setExamen( new Examen(docente1,consignas_matematica1 ));
    alumno1.getExamen().setNota(10.0);

    //Veo datos
        System.out.println("Alumno: " + alumno1.getNombre() + " (" +alumno1.getDni() + ")");
        alumno1.getExamen().mostrarDatos();
    }
}
