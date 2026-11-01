import java.util.Scanner;
/**
 * Ejercicio 06: Generar un solución que permita calcular y mostrar el pago 
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del 
 * préstamo y el interés mensual a cobrar.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double montoPrestamo, interesMensual, pagoMensual;
        System.out.println("¿Cuanto dinero quieres que te prestemos?: ");
        montoPrestamo = tcl.nextDouble();
        System.out.println("Interes mensual: %");
        interesMensual = tcl.nextDouble();
        pagoMensual = montoPrestamo * (1 + interesMensual / 100) / 12;
        System.out.println("Tus pagos mensuales seran de: $" + pagoMensual);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * �Cuanto dinero quieres que te prestemos?: 
850
Interes mensual: %
14
Tus pagos mensuales seran de: $80.75000000000001
BUILD SUCCESSFUL (total time: 6 seconds)
 */