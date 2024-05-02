/*
Añada a la clase Functions, que se proporciona escrita en Java, una función pública de clase llamada swap que admita
como parámetro una string y devuelva una nueva string que contenga las mismas palabras que la pasada por parámetro,
en orden inverso, separadas por un único espacio y con la incial de cada palabra en mayúscula y el resto en minúscula.
La string pasada como parámetro solo contiene palabras y espacios.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Hola mundo de Diana";
        System.out.println(swap(text));
    }
    public static String swap(String text){
        String[] textList = text.split("\\s");
        String[] result = new String[textList.length];
        for (int i=0; i<textList.length; i++){
            String word = textList[i].toLowerCase();
            String firstLetter = String.valueOf(word.charAt(0));
            word = firstLetter.toUpperCase() + word.substring(1, word.length());
            textList[i] = word;
        }
        int j = 0;
        for (int i=textList.length-1; i >= 0; i--){
            result[j] = textList[i];
            j++;
        }
        return Arrays.toString(result);
    }
}
