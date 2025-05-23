package guia3.ejercicio3;

public class Ej3_6 {
    public static void main(String[] args) {
        Point[] points = new Point[10];

        /*Otra forma:
        * Point[] points = new Point[] {
                new Point(0, 0),
                new Point(1, 2),
                new Point(2, 4),
                new Point(3, 6),
                new Point(4, 8)
            };
        */

        for(int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i);
        }

        for (Point point : points) {
            System.out.println(point.getX() + ", " + point.getY());
        }
    }
}
