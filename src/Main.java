/*
Añada a la clase ArrayTools un método público de clase llamado palabrasEnMente que reciba un array de Strings y
devuelva un nuevo array de Strings. El array devuelto debe tener el mismo tamaño que el pasado como parámetro. El
array pasado como parámetro contiene una lista de palabras. El array resultante contendrá las mismas palabras, excepto
aquellas que terminen en "mente", que se modificarán eliminando ese sufijo.
Por ejemplo:
Entrada: {"El", "gato", "insolentemente", "saltaba", "ágilmente" }
Salida: {"El", "gato", "insolente", "saltaba", "´´ágil" }
*/
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"El", "gato", "insolentemente", "saltaba", "ágilmente"};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(palabrasEnMente(array)));
    }
    public static String[] palabrasEnMente(String[] array){
        for (int i=0; i<array.length; i++){
            if (array[i].endsWith("mente")) {
                array[i] = array[i].replaceAll("mente", "");
            }
        }
        return array;
    }
}
