package geometry;

public class Square extends Rectangle {

    public Square(double lato, Point2D posizione) {
        super(lato, lato, posizione);
    }

    public void setLato(double lato) {
        setBase(lato);
        setAltezza(lato);
    }

    public double getLato() {
        return getBase();
    }

    public Point2D getPosizione() {
        return getPosizione();
    }

    public void setPosizione(Point2D posizione) {
        setPosizione(posizione);
    }

    @Override
    public void draw() {
        System.out.println("Sto stampaando un quadrato");
    }

}