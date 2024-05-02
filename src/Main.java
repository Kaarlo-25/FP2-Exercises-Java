/*
En la clase ArrayTools, complete el método .zip(). El método recibe dos arrays de elmentos de tipo int y devuelve un
nuevo array del mismo tamaño que el más corto de los arrays pasados como parámetros. Cada elemento de este nuevo array
será un array de dos elementos de tipo int que almacenará la pareja de elementos que ocupan la misma posición en los
arrays pasados como parámetros. Ejemplo:

int[] x = {0, 1, 2, 3, 4};
int[] y = {5, 6, 7, 8, 9, 10};
int[][] resultado = {{0, 5}, {1, 6}, {2, 7}, {3, 8}, {4, 9}};
 */
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] x = {0, 1, 2, 3, 4};
        int[] y = {5, 6, 7, 8, 9, 10};
        int[][] result = zip(x, y);
        for (int[] row: result){
            System.out.println(Arrays.toString(row));
        }
    }
    public static int[][] zip(int[] x, int[] y){
        int[] shortest;
        int[] longest;
        if (x.length > y.length){
            shortest = y;
            longest = x;
        } else{
            shortest = x;
            longest = y;
        }
        int[][] result = new int[shortest.length][2];
        for (int i=0; i < shortest.length; i++){
            result[i][0] = shortest[i];
            result[i][1] = longest[i];
        }
        return result;
    }
}