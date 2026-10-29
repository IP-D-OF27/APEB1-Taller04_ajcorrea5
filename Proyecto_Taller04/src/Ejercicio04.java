import java.util.Scanner;
/**
 * Ejercicio 04: Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos, 
 * el número de minutos consumidos en el mes.
 * @author Andy Correa
 * @version 1.0
 */

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoMinutos, numeroMinutos, planillaTelefono;
        System.out.println("Costo por minutos: ");
        costoMinutos = tcl.nextDouble();
        System.out.println("Numero de minutos consumidos en el mes: ");
        numeroMinutos = tcl.nextDouble();
        planillaTelefono = costoMinutos * numeroMinutos;
        System.out.println("Planilla del telefono: $" + planillaTelefono);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Costo por minutos: 
0,30
Numero de minutos consumidos en el mes: 
10
Planilla del telefono: $3.0
BUILD SUCCESSFUL (total time: 20 seconds)
 */