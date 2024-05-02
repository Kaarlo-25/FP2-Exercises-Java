/*
Añada a la clase OddEven un método de clase público llamado isOdd con un parámetro de tipo int. El método devolverá
true si el número pasado como parámetro es impar y false si es par.
 */
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.println(number % 2 != 0);
    }
}