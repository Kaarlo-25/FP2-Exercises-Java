/*
Añada a la clase ArrayTools un método público de clase llamado isSorted que acepte como parámetro un array de elementos
de tipo int y devuelva un resultado de tipo boolean.

El resultado será true si los elementos del array están ordenados en orden creciente y false si no lo están.

Un array está ordenado en orden creciente si cada elemento, menos el primero, es mayor o igual que el anterior. Un array
vacío, o con un solo elemento, se considera ordenado.
 */


public class Main{
    public static void main(String[] args){
        int[] array = {1,2,4,4,5,6,7};
        int[] array1 = {3,1,4,5,6,7,8};
        System.out.println(isSorted(array));
        System.out.println(isSorted(array1));
    }
    public static boolean isSorted(int[] array){
        int num = array[0];
        for (int i=1; i < array.length; i++){
            if (array[i] < num){
                return false;
            } else{
                num = array[i];
            }
        }
        return true;
    }
}