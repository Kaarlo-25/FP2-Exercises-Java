/*
Escriba un programa en Java que lea del teclado dos números enteros que representan la base y la altura de un
rectángulo y muestre en pantalla su perímetro.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Base: ");
        int base = scanner.nextInt();
        System.out.print("Altura: ");
        int height = scanner.nextInt();
        System.out.println(2*base + 2*height);
    }
}