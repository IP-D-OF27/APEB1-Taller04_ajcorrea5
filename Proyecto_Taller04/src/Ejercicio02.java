import java.util.Scanner;

/**
 * Ejercicio 02: Generar un algoritmo que permite ingresar los gastos de tres 
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia.
 * @author Andy Correa
 * @version 1.0
 */

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int gastoHijo1, gastoHijo2, gastoHijo3, totalGastos;
        System.out.println("Gasto hijo 1: ");
        gastoHijo1 = tcl.nextInt();
        System.out.println("Gasto hijo 2: ");
        gastoHijo2 = tcl.nextInt();
        System.out.println("Gasto Hijo 3: ");
        gastoHijo3 = tcl.nextInt();
        totalGastos = (gastoHijo1 + gastoHijo2 + gastoHijo3);
        System.out.println("Total de gastos: " + totalGastos);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Gasto hijo 1: 
20
Gasto hijo 2: 
10
Gasto Hijo 3: 
30
Total de gastos: 60
BUILD SUCCESSFUL (total time: 11 seconds)
 */