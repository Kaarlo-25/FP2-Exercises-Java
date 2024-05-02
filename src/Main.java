/*
La función sum_lists(), escrita en Python, que se muestra a continuación, toma como parámetros dos listas y devuelve
una nueva lista del tamaño de la mayor, cuyos elementos son la suma de los elementos del mismo índice de las dos listas
pasadas como parámetros. A efectos de realizar la suma, es como si consideráramos que los elementos que nos faltan al
final de la lista más corta tienen el valor cero, es decir, la lista resultante se queda en esas posiciones con los
valores que tenía la lista más larga.

def sum_lists(numbers1, numbers2):
    """Suma dos listas de enteros"""

    result = [0 for i in range(max(len(numbers1), len(numbers2)))]

    # Sumamos los elementos que existen en ambas listas

    for i in range(min(len(numbers1), len(numbers2))):
        result[i] = numbers1[i] + numbers2[i]

    # completamos con el resto de los elementos de la lista más larga

    if len(numbers1) > len(numbers2):
        for i in range(len(numbers2), len(numbers1)):
            result[i] = numbers1[i]
    elif len(numbers1) < len(numbers2):
        for i in range(len(numbers1), len(numbers2)):
            result[i] = numbers2[i]

    return result
Añada a la clase ArrayTools un método público de clase llamado sumLists. El método tomará dos arrays de enteros y
reproducirá el comportamiento de la función sum_lists, devolviendo un nuevo array de enteros.

Recuerde que, para crear un array de elementos de tipo int, de un tamaño predetermindado, incializado con ceros, en
Java, hacemos:
int[] nuevo = int[tamaño];
La función sum_lists hace uso de las funciones min() y max() de Python para determinar qué lista tiene menor longitud.
Esto mismo puede hacerse en Java con los métodos Math.min() y Math.max():

x = Math.min(10, 15); // x toma el valor 10
x = Math.max(10, 15); // x toma el valor 15
 */
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(sumLists(array1, array2)));
        System.out.println(Arrays.toString(array2));
    }
    public static int[] sumLists(int[] array1, int[] array2){
        int[] result;
        int[] shortest;
        if (array1.length > array2.length){
            result = Arrays.copyOf(array1, array1.length);
            shortest = array2;
        } else {
            result = Arrays.copyOf(array2, array2.length);
            shortest = array1;
        }
        for (int i=0; i < shortest.length; i++){
            result[i] = result[i] + shortest[i];
        }
        return result;
    }
}