package matematica;

public class EsempioSomma {

    private double num1;
    private double num2;

    public EsempioSomma() {

    }

    public EsempioSomma(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public Double sum() {

        double sum = num1 + num2;
        System.err.println(String.format("\n La somma è %f \n", sum));
        return sum;
    }
}
