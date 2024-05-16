/*
Se tiene implementada en Java una clase llamada SteppedCounter. Esta clase sirve para representar un contador que se
inicializará con el valor entero 0. Tiene un método sin parámetros llamado .step(), que incrementa el valor del contador
en un "paso", siendo este un valor entero que se pasa como parámetro en el constructor de la clase. Además, tiene un
método llamado .getValue(), que devuelve el valor del contador en el momento en que se llama, y un método llamado
.reset(), que repone el valor del contador a cero. En la clase SteppedCounter el valor del contador se almacena en un
atributo potected llamado count, y el paso se guarda en otro atributo protected llamado stepValue.

Se pide desarrollar una nueva clase llamada SteppedCounterCloneable, heredera de SteppedCounter. Esta clase tiene que
implemetar la interfaz Cloneable para copiar objetos de tipo SteppedCounterCloneable.

Será necesario implementar un constructor, simplemente para pasar el parámetro del paso a la superclase.
*/

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SteppedCounterCloneable s = new SteppedCounterCloneable(1);
        System.out.println(s);
        SteppedCounterCloneable s1 = s.clone();
        System.out.println(s1);
    }
}

