import java.util.Scanner;
/**
 * Ejercicio 07: Generar un algoritmo que permita calcular y mostrar el valor a 
 * cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario 
 * tiene edad mayor a 65 años, se debe descontar el 10%.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoKilovatio, kilovatiosConsumidos, valorCancelar;
        int edad;
        System.out.println("Valor de costo por Kilovatio/hora: ");
        costoKilovatio = tcl.nextDouble();
        System.out.println("Kilovatios consumidos: ");
        kilovatiosConsumidos = tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edad = tcl.nextInt();
        valorCancelar = costoKilovatio * kilovatiosConsumidos;
        if (edad >= 65)
            valorCancelar = valorCancelar - (valorCancelar * 0.10);
        else
            valorCancelar = valorCancelar;
        System.out.println("Total a pagar: $" + valorCancelar);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Valor de costo por Kilovatio/hora: 
0,10
Kilovatios consumidos: 
200
Ingrese la edad del usuario: 
66
Total a pagar: $18.0
BUILD SUCCESSFUL (total time: 7 seconds)
* run:
* Valor de costo por Kilovatio/hora: 
0,10
Kilovatios consumidos: 
200
Ingrese la edad del usuario: 
44
Total a pagar: $20.0
BUILD SUCCESSFUL (total time: 8 seconds)
 */