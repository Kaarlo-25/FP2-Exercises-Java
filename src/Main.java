/*
La siguiente función en Python toma como parámetro un número real, que representa una distancia en kilómetros y
devuelva su equivalente en millas.

def km2mi(km: float):
    """Convierte de kilómetros a millas"""
    return km * 0.621371

Tradúzcala a una función public static en Java, con el mismo nombre, que tome un parámetro de tipo double y devuelva
un resultado de tipo double.

Nota: 1 Km equivale a 0.621371 mi
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Km: ");
        double input = scanner.nextDouble();
        System.out.printf("Miles: %f", km2miles(input));
    }
    public static double km2miles(double km){
        return km * 0.621371;
    }
}