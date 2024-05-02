/*
La siguiente función en Python sirve para contar el número de palabras de un texto que empiezan por vocal (se cosidera
palabra cualquier secuencia de caracteres que no contenga espacios):


def initial_vowels(text):
   """Devuelve el número de palabras en un texto que empiezan por vocal"""


   vowels = "AEIOUÁÉÍÓÚÜaeiouáéíóúü"
   count = 0


   if len(text) > 0:
       for word in text.split():
           if word[0] in vowels:
               count += 1


   return count
Añada a la clase Functions, que se proporciona escrita en Java, una función pública de clase llamada initialVowels que
realice la misma tarea. El parámetro de entrada de la función será de tipo String y o el valor devuelto por la función
será de tipo int.
*/
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce text: ");
        String text = scanner.nextLine();
        System.out.println(initial_vowels(text));
    }


    public static int initial_vowels(String text){
        String vowels = "AEIOUaeiouÁÉÍÚÓáéíóú";
        int counter = 0;
        text = text.replaceAll("[.,;]", "");
        String[] textList = text.split("\\s");
        for (String word : textList){
            if (vowels.contains(String.valueOf(word.charAt(0)))){
                counter ++;
            }
        }
        System.out.println(Arrays.toString(textList));
        return counter;
    }
}
