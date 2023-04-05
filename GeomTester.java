package lesson1.geometry;

public class GeomTester {
    public static void main(String[] args) {
        Point se = new Point(12, 6);
        Point nw = new Point(8, 4);

        Rectangle rectangle = new Rectangle(se, nw);

        System.out.println(rectangle.area());

    }
}
