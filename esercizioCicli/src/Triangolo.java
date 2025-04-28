public class Triangolo {

    private double lato1;
    private double lato2;
    private double lato3;

    public double getLato1() {
        return lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public Triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }

    public String check(Triangolo triangle) {
        String tipo;

        if (triangle.lato1 == triangle.lato2 && triangle.lato2 == triangle.lato3) {
            tipo = "tTrinagolo equilatero";
        } else if (triangle.lato1 == triangle.lato2 || triangle.lato1 == triangle.lato3
                || triangle.lato2 == triangle.lato3) {
            tipo = "tTrinagolo isoscele";
        } else {
            tipo = "tTrinagolo scaleno";
        }

        return tipo;
    }
}
