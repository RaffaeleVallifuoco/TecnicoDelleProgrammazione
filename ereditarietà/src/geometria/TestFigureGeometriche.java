package geometria;

public class TestFigureGeometriche {
    public static void main(String[] args) {

        FiguraGeometrica quadrato = new Quadrato(4, "Quadrato", 2.2);
        FiguraGeometrica cerchio = new Cerchio(0, "Cerchio", 3.0);
        FiguraGeometrica triangolo = new Triangolo(3, "Triangolo equilatero", 4.2, 4.2, 4.2, 4.2);

        System.out.println("Area quadrato: " + quadrato.calcolaArea());
        System.out.println("Area quadrato: " + quadrato.calcolaPerimetro());
        System.out.println("Area cerchio: " + cerchio.calcolaArea());
        System.out.println("Area cerchio: " + cerchio.calcolaPerimetro());
        System.out.println("Area triangolo: " + triangolo.calcolaArea());
        System.out.println("Area triangolo: " + triangolo.calcolaPerimetro());

    }

}
