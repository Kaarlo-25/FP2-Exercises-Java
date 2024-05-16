/*
Desarrolle una nueva clase heredera de Point2D, llamada Point3D, que represente un punto en el espacio (tres coordenadas,
x, y, z). Esta clase deberá:
 - tener un constructor con tres parámetros que representen, en este orden, las coordenadas x, y, z del punto
 - redefinir el método .equals(Object other) para que evalue si dos objetos de la clase Point3D son iguales (lo son si son
   iguales, una a una, sus tres coordenadas)
 - redefinir el método .toString() para que devuelva una representación como string del objeto Point3D. Esta representación
   muestra sus coordenadas, identificadas y separadas por comas, como: "x: 3.5, y: 8.2, z: 2.5".
 - redefinir el método .coordinates para que devuelva un array de 3 elementos de tipo double
 - Los métodos anteriores deben aprovechar, en lo posible, las implementaciones ya existentes en la superclase.
*/

public class Point3D extends Point2D{
    double z;

    public Point3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    @Override
    public boolean equals(Object other){
        if (other instanceof Point3D) {
            Point3D p = (Point3D) other;
            return super.equals(other) && p.z == this.z;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", z: " + this.z;
    }

    @Override
    public double[] coordinates(){
        return new double[] {super.coordinates()[0], super.coordinates()[1], this.z};
    }
}
