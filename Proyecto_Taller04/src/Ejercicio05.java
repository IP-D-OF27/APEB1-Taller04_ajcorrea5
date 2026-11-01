import java.util.Scanner;
/**
 * Ejercicio 05: Generar un algoritmo que permita calcular y mostrar el costos 
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoCPU, costoTeclado, costoPantalla, costoRaton, costoTotal;
        System.out.println("Ingrese el costo del CPU: ");
        costoCPU = tcl.nextDouble();
        System.out.println("Ingrese el costo del teclado: ");
        costoTeclado = tcl.nextDouble();
        System.out.println("Ingrese el costo de la pantalla: ");
        costoPantalla = tcl.nextDouble();
        System.out.println("Ingrese el costo del raton: ");
        costoRaton = tcl.nextDouble();
        costoTotal = costoCPU + costoTeclado + costoPantalla + costoRaton;
        System.out.println("Precio de la computadora: $" + costoTotal);        
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese el costo del CPU: 
350,40
Ingrese el costo del teclado: 
35,20
Ingrese el costo de la pantalla: 
110
Ingrese el costo del raton: 
25,50
Precio de la computadora: $521.0999999999999
BUILD SUCCESSFUL (total time: 36 seconds)
 */