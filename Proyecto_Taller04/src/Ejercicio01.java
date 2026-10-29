
import java.util.Scanner;

/**
 * Ejercicio 01: Generar un algoritmo que permite calcular y presentar el área 
 * de un triángulo. Los datos deben ser pedidos al usuario. 
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double base, altura, area;
        System.out.println("Deme base: ");
        base = tcl.nextDouble();
        System.out.println("Deme altura: ");
        altura = tcl.nextDouble();
        area = (base * altura) / 2;
        System.out.println("Area: " + area);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Deme base: 
6
Deme altura: 
4
Area: 12.0
BUILD SUCCESSFUL (total time: 16 seconds)
 */