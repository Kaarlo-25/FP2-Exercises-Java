/*
Un punto en el plano se representa mediante una pareja de coordenadas (x, y).
Dados dos puntos en el plano, p1 = (x1, y1) y p2 = (x2, y2):
    - son iguales si x1 = x2 e y1 = y2.
    - es menor el que tenga un valor menor para la coordenada x
    - si las coordenadas x son iguales, es menor el que tenga un valor menor para la coordenada y

Se tiene una clase llamada Point2D cuyos objetos sirven para representar un punto en el plano. Esta clase tiene dos
atributos protected, de tipo double, llamados x e y, que almacenan las coordenadas del punto representado. Esta clase
define el método .equals(Object other) para devolver true si el punto representado por this y el punto representado por
other son iguales y false si no lo son.

Desarrolle una nueva clase heredera de Point2D, llamada Point2DComparable, que implemente la interfaz
Comparable<Point2DComparable>. El método .compareTo(Point2DComparable other) devuelve 0 si el punto representado por
this y el punto representado por other son iguales. Si son distintos devuelve devuelve -1 si this es menor o +1 si lo
es other.

Notas:

Recuerde que la clase debe extender Point2D e implementar Comparable<Point2DComparable>.
Es necesario implementar un constructor para la clase Point2DComparable que recoja las coordenadas del punto y las pase
al constructor de las superclase.
*/

public class Main {
    public static void main(String[] args) {
        Point2DComparable p = new Point2DComparable(2, 4);
        Point2DComparable p1 = new Point2DComparable(2, 3);
        System.out.println(p.compareTo(p1));
    }
}

