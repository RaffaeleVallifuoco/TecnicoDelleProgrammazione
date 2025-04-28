package matematica;

public class EsempioDivisione {

    private double num1;
    private double num2;

    public EsempioDivisione() {

    }

    public EsempioDivisione(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public Double division() {

        double division;
        if (num1 > num2) {
            division = num1 / num2;
        } else {
            division = num2 / num1;
        }

        System.out.println(String.format("\n La divisione è %f \n", division));
        return division;
    }
}
