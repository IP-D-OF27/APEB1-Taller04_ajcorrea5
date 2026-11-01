import java.util.Scanner;
/**
 * Ejercicio 10: El programa debe calcular el área del polígono. La figura se 
 * compone de un cuadrado perfecto (A), tres triángulos rectángulos iguales 
 * (B, C, E), cuya base mide lo mismo que uno de los lados del cuadrado, y un 
 * rectángulo (D) cuyo ancho mide lo mismo que uno de los lados del cuadrado, 
 * mientras que la altura mide lo mismo que la altura de los triángulos. Se pide 
 * que haga un programa que calcule el área total.

Por cultura general, sabemos que el área de un rectángulo se calcula 
* multiplicando su base por su altura; el área de un triángulo rectángulo se 
* calcula multiplicando su base por su altura, y luego dividiendo el resultado 
* entre dos; finalmente, el área de un cuadrado se calcula elevando al cuadrado 
* la medida de uno de sus lados.
* La parte interesante de este problema es determinar el mínimo número de datos 
* que hay que preguntar.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double ladoC, alturaT, areaC, areaT, areaR, areaTotal;
        System.out.println("Ingrese el lado del cuadrado: ");
        ladoC = tcl.nextDouble();
        System.out.println("Ingrese la altura de los triangulos: ");
        alturaT = tcl.nextDouble();
        areaC = ladoC * ladoC;
        areaT = 3 * (ladoC * alturaT) / 2;
        areaR = ladoC * alturaT;
        areaTotal = areaC + areaT + areaR;
        System.out.println("Area del cuadrado: " + areaC + "m2");
        System.out.println("Area de los triangulos: " + areaT + "m2" );
        System.out.println("Area del rectangulo: " + areaR + "m2");
        System.out.println("Area total del poligono: " + areaTotal + "m2");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese el lado del cuadrado: 
7,5
Ingrese la altura de los triangulos: 
3
Area del cuadrado: 56.25m2
Area de los triangulos: 33.75m2
Area del rectangulo: 22.5m2
Area total del poligono: 112.5m2
BUILD SUCCESSFUL (total time: 4 seconds)
 */