package matematica;

public class EsempioSottrazione {

    private double num1;
    private double num2;

    public EsempioSottrazione() {

    }

    public EsempioSottrazione(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public Double diff() {

        double diff;
        if (num1 > num2) {
            diff = num1 - num2;
        } else {
            diff = num2 - num1;
        }

        System.out.println(String.format("\n La differenza è %f \n", diff));
        return diff;
    }
}
