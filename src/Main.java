/*
Añada a la clase ArrayTools un método público de clase llamado mayores que acepte como parámetros un array, myArray,
de elementos de tipo double y un valor, value, de tipo double, y devuelva un resultado de tipo int.

El método mayores devolverá el número de elementos de myArray que son mayores que value.
 */


public class Main{
    public static void main(String[] args){
        int[] array = {1, 2, 7, 4, 5, 6, 7, 8, 9, 10};
        int value = 6;
        System.out.println(mayores(array, value));
    }
    public static int mayores(int[] array, int value){
        int counter = 0;
        for (int num : array) {
            if (num > value){
                counter ++;
            }
        }
        return counter;
    }
}