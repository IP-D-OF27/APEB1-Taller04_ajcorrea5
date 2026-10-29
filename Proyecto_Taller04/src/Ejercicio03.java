import java.util.Scanner;
/**
 * Ejercicio 03: Se desea desarrollar un algoritmo que permita mostrar la tabla 
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el 
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos.
 * @author Andy Correa
 * @version 1.0
 */

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num1;
        System.out.print("Ingrese un numero del 2 al 6: ");
        num1 = tcl.nextInt();
        if (num1 >=2 && num1 <=6){
            System.out.println(num1 +" x 1 =" + num1 * 1);
            System.out.println(num1 +" x 2 =" + num1 * 2);
            System.out.println(num1 +" x 3 =" + num1 * 3);
            System.out.println(num1 +" x 4 =" + num1 * 4);
            System.out.println(num1 +" x 5 =" + num1 * 5);
            System.out.println(num1 +" x 6 =" + num1 * 6);
            System.out.println(num1 +" x 7 =" + num1 * 7);
            System.out.println(num1 +" x 8 =" + num1 * 8);
            System.out.println(num1 +" x 9 =" + num1 * 9);
            System.out.println(num1 +" x 10 =" + num1 * 10);
        }
        else
            System.out.println("Numero invalido");
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese un numero del 2 al 6: 2
2 x 1 =2
2 x 2 =4
2 x 3 =6
2 x 4 =8
2 x 5 =10
2 x 6 =12
2 x 7 =14
2 x 8 =16
2 x 9 =18
2 x 10 =20
BUILD SUCCESSFUL (total time: 2 seconds)
* run:
Ingrese un numero del 2 al 6: 10
Numero invalido
BUILD SUCCESSFUL (total time: 2 seconds)
* 
 */