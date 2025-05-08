package sottraendo;

public class Sottrazione {
    public static double sottrai(double numero, double[] numeri) throws SottraiException {
        double result = numero;

        for (double currentNumber : numeri) {
            result -= currentNumber;

            if (result < 0) {
                throw new SottraiException("ATTENZIONE! Numeri negativi non ammessi");
            }
        }

        return result;
    }
}
