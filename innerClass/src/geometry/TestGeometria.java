package geometry;

public class TestGeometria {
    public static void main(String[] args) {

        System.err.println("--------- TEST GEOMETRIA ----------");

        Rectangle r = new Rectangle(4, 2, new Point2D(1, 3));
        Square s = new Square(5, new Point2D(7, 2));

        r.draw();
        s.draw();

        System.out.println("Area rettangolo: " + r.area());
        System.out.println("Perimetro rettangolo: " + r.perimetro());

        System.out.println("Area quadrato: " + s.area());
        System.out.println("Perimetro quadrato: " + s.perimetro());
    }
}
