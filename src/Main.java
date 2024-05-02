/*El programa que que se proporciona en el fichero suma.py toma dos números enteros y muestra en pantalla su suma.
Complete la función main de la clase Suma (fichero Suma.java) para que haga lo mismo.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce second number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1+num2);
    }
}