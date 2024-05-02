/*
Desarrolle una función public static void llamada showNumbers que tome como parámetros dos  números enteros y muestre,
uno por línea y de menor a mayor, todos los números mayores o iguales que el primer número y menores o iguales que el
segundo. Por ejemplo:

Se pasa: 12, 17

Se muestra:
12
13
14
15
16
17
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        showNumbers(num1, num2);
    }
    public static void showNumbers(int num1, int num2){
        for (; num1 <= num2; num1++){
            System.out.println(num1);
        }
    }
}