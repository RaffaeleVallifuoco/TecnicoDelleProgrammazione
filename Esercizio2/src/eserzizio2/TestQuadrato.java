package eserzizio2;

public class TestQuadrato {

    public static void main(String[] args) {

        // QUADRATO

        Quadrato square = new Quadrato(4.4);

        Quadrato.perimetro(square);
        Quadrato.area(square);
        System.out.println("--------------------------------");
        System.out.println(String.format("Area quadrato : %f, perimetro : %f", Quadrato.area(square),
                Quadrato.perimetro(square)));
        System.out.println("--------------------------------");

    }

}
