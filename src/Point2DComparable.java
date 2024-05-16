/*
Desarrolle una nueva clase heredera de Point2D, llamada Point2DComparable, que implemente la interfaz
Comparable<Point2DComparable>. El método .compareTo(Point2DComparable other) devuelve 0 si el punto representado por
this y el punto representado por other son iguales. Si son distintos devuelve devuelve -1 si this es menor o +1 si lo
es other.

Notas:

Recuerde que la clase debe extender Point2D e implementar Comparable<Point2DComparable>.
Es necesario implementar un constructor para la clase Point2DComparable que recoja las coordenadas del punto y las pase
al constructor de las superclase.
*/

public class Point2DComparable extends Point2D implements Comparable<Point2DComparable> {
    public Point2DComparable(double x, double y) {
        super(x, y);
    }

    public int compareTo(Point2DComparable other) {
        Point2DComparable p = (Point2DComparable) other;
        if (this.equals(p)) {
            return 0;
        } else if (this.x > p.x || (this.x == p.x && this.y > p.y)) {
            return 1;
        } else {
            return -1;
        }
    }
}
