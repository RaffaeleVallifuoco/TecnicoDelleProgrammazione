public class Quadrato {

    private double lato1;
    private double lato2;
    private double lato3;
    private double lato4;

    public double getLato1() {
        return lato1;
    }

    public double getLato2() {
        return lato2;
    }

    public double getLato3() {
        return lato3;
    }

    public double getLato4() {
        return lato4;
    }

    public Quadrato(double lato1, double lato2, double lato3, double lato4) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.lato4 = lato4;
    }

    public String check(Quadrato square) {

        if (this.lato1 == this.lato2 && this.lato2 == this.lato3 && this.lato4 == this.lato1) {
            return "\n Il quadrilatero inserito è un quadrato \n";
        } else
            return "\n Il quadrilatero inserito non è un quadrato \n";
    }
}