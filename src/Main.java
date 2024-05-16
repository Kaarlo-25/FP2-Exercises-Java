/*
Un punto en el plano se representa mediante una pareja de coordenadas (x, y). Dados dos puntos en el plano, p1 = (x1, y1)
y p2 = (x2, y2) son iguales si x1 = x2 e y1 = y2.

Se tiene una clase llamada Point2D cuyos objetos sirven para representar un punto en el plano. Esta clase tiene dos
atributos protected, de tipo double, llamados x e y, que almacenan las coordenadas del punto representado. Esta clase
define:

- el método .equals(Object other) para devolver true si el punto representado por this y el punto representado por other
  son iguales y false si no lo son.
- el método .toString() para devolver una representación como string del objeto Point2D. Esta representación muestra sus
  coordenadas, identificadas y separadas por comas, como: "x: 3.5, y: 8.2".
- un método .coordinates() que devuelve un array de dos elementos de tipo double con las coordenadas del punto (la
  coordenada x en la posición 0 y la coordenada y en la posición 1)

Desarrolle una nueva clase heredera de Point2D, llamada Point3D, que represente un punto en el espacio (tres coordenadas,
x, y, z). Esta clase deberá:
 - tener un constructor con tres parámetros que representen, en este orden, las coordenadas x, y, z del punto
   redefinir el método .equals(Object other) para que evalue si dos objetos de la clase Point3D son iguales (lo son si son
   iguales, una a una, sus tres coordenadas)
 - redefinir el método .toString() para que devuelva una representación como string del objeto Point3D. Esta representación
   muestra sus coordenadas, identificadas y separadas por comas, como: "x: 3.5, y: 8.2, z: 2.5".
 - redefinir el método .coordinates para que devuelva un array de 3 elementos de tipo double
 - Los métodos anteriores deben aprovechar, en lo posible, las implementaciones ya existentes en la superclase.
*/

public class Main {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 1, 3);
        System.out.println(p);
        System.out.println(p.equals(p2));
    }
}

