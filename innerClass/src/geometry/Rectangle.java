package geometry;

public class Rectangle implements TwoDShape, Shape {
    private double base;
    private double altezza;
    private Point2D posizione;

    public Rectangle() {

    }

    public Rectangle(double base, double altezza, Point2D posizione) {
        this.base = base;
        this.altezza = altezza;
        this.posizione = posizione;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public Point2D getPosizione() {
        return posizione;
    }

    public void setPosizione(Point2D posizione) {
        this.posizione = posizione;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return (this.base * this.altezza);
    }

    @Override
    public double perimetro() {
        return (this.base * 2) + (this.altezza) * 2;

    }

    @Override
    public void draw() {
        System.out.println("Non so come e perchè ma sto disegnando un rettangolo");
    }

}
