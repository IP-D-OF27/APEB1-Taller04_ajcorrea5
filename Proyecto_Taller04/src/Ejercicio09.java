import java.util.Scanner;
/**
 * Ejercicio 09: Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final y un 
 * porcentaje de asistencia. La regla institucional establece que:
La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la nota 
* final redondeada a un decimal.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double evaluacionContinua, calificacionExamen, porcentajeAsist, notaF;
        String estado;
        System.out.println("Ingrese la nota de evaluacion continua: ");
        evaluacionContinua = tcl.nextDouble();
        System.out.println("Ingrese la nota del examen final: ");
        calificacionExamen = tcl.nextDouble();
        System.out.println("Ingrese el porcentaje de asistencia: ");
        porcentajeAsist = tcl.nextDouble();
        notaF = (evaluacionContinua * 0.40) + (calificacionExamen * 0.60);
        if (porcentajeAsist < 65)
            estado = "Reprobado";
        else
            if (calificacionExamen < 5)
                estado = "Reprobado";
        else
                if (notaF >= 7)
                    estado = "Aprobado";
        else
                    estado = "Supletorio";
        System.out.printf("Nota final: %.1f%n", notaF);
        System.out.println("Estado academico: " + estado);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese la nota de evaluacion continua: 
6,5
Ingrese la nota del examen final: 
7,5
Ingrese el porcentaje de asistencia: 
77
Nota final: 7,1
Estado academico: Aprobado
BUILD SUCCESSFUL (total time: 12 seconds)
 */