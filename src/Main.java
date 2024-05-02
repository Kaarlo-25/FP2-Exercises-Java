/*
El programa que se proporciona escrito en Python lee del teclado dos números enteros que representan la base y la
altura de un rectángulo y muestra en pantalla su área. Ejemplo :

Base: 3
Altura: 5
15

Complete el programa que se proporciona escrito en Java para que haga lo mismo.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        int base = scanner.nextInt();
        System.out.print("Altura: ");
        int height = scanner.nextInt();
        System.out.println(height*base);
    }
}