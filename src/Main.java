/*
El programa que se proporciona escrito en Python lee un valor entero del teclado y muestra en pantalla los valores
anterior y siguiente. Por ejemplo, si se introduce 5, se muestran en pantalla el 4 y el 6, en este orden.

Complete el programa que se proporciona escrito en Java para que haga lo mismo.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scanner.nextInt();
        System.out.println(input+1);
        System.out.println(input-1);
    }
}