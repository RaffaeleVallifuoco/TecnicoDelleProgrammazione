package matematica;

public class EsempioMoltiplicazione {

    private double num1;
    private double num2;

    public EsempioMoltiplicazione() {

    }

    public EsempioMoltiplicazione(double num1, double num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public Double product() {

        double product = num1 * num2;
        System.err.println(String.format("\n Il prodotto è %f \n", product));
        return product;
    }

}
