/*
Un punto en el plano se prepresenta por dos coordenadas: (x, y).

Implemente una clase llamada Point2D para representar puntos en el plano. Esta clase deberá tener:

Un constructor que admita dos parámetros de tipo double que representan, en este orden, los valores para inicializar
las coordenadas x e y del objeto Point2D a crear.
Métodos getters y setters para los atributos de los objetos de Point2D. Estos métodos deben llamarse: getX, setX, getY
y setY.
Nota: las reglas estilo no permiten que los nombres de los miembros de una clase tengan una sola letra (deben seguir el
patrón ^[a-z][a-z0-9][a-zA-Z0-9]*$); deberá elegir nombres asecuados para representar internamente los valores de x e y.
*/

public class Main {
    public static void main(String[] args) {
        Point2D point = new Point2D(2, 3);
        System.out.println(point.getX());
    }
}

