import java.util.Scanner;
/**
 * Ejercicio 08: Se debe generar una solución que permita calcular y mostrar el 
 * valor total a pagar mensual de servicios digitales de una persona. Los 
 * servicios digitales son: netflix, youtube premium, dropbox, spotify. Si la 
 * persona es menor a 30 años se descuenta el 20% del total mensual.
 * @author Andy Correa
 * @version 1.0
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double valorNetflix, valorYoutube, valorDropbox, valorSpotify, total;
        int edad;
        System.out.println("Ingrese el precio mensual de Netflix: ");
        valorNetflix = tcl.nextDouble();
        System.out.println("Ingrese el precio mensual de Youtube premium: ");
        valorYoutube = tcl.nextDouble();
        System.out.println("Ingrese el precio mensual de Dropbox: ");
        valorDropbox = tcl.nextDouble();
        System.out.println("Ingrese el precio mensual de Spotify: ");
        valorSpotify = tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edad = tcl.nextInt();
        total = valorNetflix + valorYoutube + valorDropbox + valorSpotify;
        if (edad <= 30)
            total = total - (total * 0.20);
        else
            total = total;
        System.out.println("Total a pagar mensual: " + total);
    }
}

/***
 * EVIDENCIA DEL RUN:
 * run:
 * Ingrese el precio mensual de Netflix: 
6
Ingrese el precio mensual de Youtube premium: 
10
Ingrese el precio mensual de Dropbox: 
11
Ingrese el precio mensual de Spotify: 
6,99
Ingrese la edad del usuario: 
31
Total a pagar mensual: 33.99
BUILD SUCCESSFUL (total time: 29 seconds)
* run:
* Ingrese el precio mensual de Netflix: 
6,99
Ingrese el precio mensual de Youtube premium: 
9,99
Ingrese el precio mensual de Dropbox: 
11
Ingrese el precio mensual de Spotify: 
6,99
Ingrese la edad del usuario: 
20
Total a pagar mensual: 27.976
BUILD SUCCESSFUL (total time: 19 seconds)
 */