/*
La función divisibles(), escrita en Python, que se muestra a continuación, toma como parámetros una lista de números
enteros y un número entero distinto de cero. La función debe devolver cuantos de los números contenidos en la lista son
divisibles por el número proporcionado como segundo parámetro.

def divisibles(números, divisor):
    """Devuelve el número de divisores dee num contenidos en lista"""

    contador = 0

    for n in números:
        if n % divisor == 0:
            contador += 1
    return contador

Añada a la clase ArrayTools un método público de clase llamado divisibles que acepte como parámetros un array de
elementos de tipo int y un valor de tipo int distinto de cero, y devuelva un resultado de tipo int que será la cuenta
de cuantos de los números contenidos en el array son divisibles por el número proporcionado como segundo parámetro.
 */


public class Main{
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 5;
        System.out.println(divisible(array, value));
    }
    public static int divisible(int[] array, int value){
        int counter = 0;
        for (int num : array){
            if (num % value == 0){
                counter ++;
            }
        }
        return counter;
    }
}