/*
Implemente en Java una clase llamada Counter. Cada objeto de esta clase se inicializará con el valor entero 0, valor
que se podrá incrementar de uno en uno invocando un método sin parámetros llamado .step(). Además, un método llamado
.getValue() devolverá el valor del contador en el momento en que se llame, y un método llamado .reset() repondrá el
valor del contador a cero.

Ejemplo de uso:

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println(count.getValue()); // Muestra 0
        for (int i = 0; i < 5; i++) {         // Muestra 1 2 3 4 5 en líneas separadas
            count.step();
            System.out.println(count.getValue());
        }

        count.reset();
        System.out.println(count.getValue());  // Muestra 0
    }
}
*/

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter();
        System.out.println(count.getValue()); // Muestra 0
        for (int i = 0; i < 5; i++) {         // Muestra 1 2 3 4 5 en líneas separadas
            count.step();
            System.out.println(count.getValue());
        }

        count.reset();
        System.out.println(count.getValue());  // Muestra 0
    }

}

