/*
Añada a la clase ArrayTools un método público de clase llamado concatenar que acepte como parámetros un array de
elementos de tipo String y un valor de tipo String. El método debe devolver una string formada por la concatenación
de todos los elementos del array pasado como primer parámetro usando como separador la string pasada como segundo
parámetro.

Nota: el operador + permite calcular la concatenación de dos strings.
 */


public class Main{
    public static void main(String[] args){
        String[] array = {"Hola", "mundo", "como", "estas?"};
        String ch = " ";
        System.out.println(concatenar(array, ch));
    }
    public static String concatenar(String[] array, String ch){
        String result = "";
        for (String word: array){
            result += word + ch;
        }
        return result;
    }
}