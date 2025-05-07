package Caclolatrice;

public class CalcolatriceAvanzata {

    public static Double somma(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double somma(Double num1, Double num2, Double num3) {
        return num1 + num2 + num3;
    }

    public static Double somma(Double num1, Double[] array) {
        double risultato = num1;
        for (Double current : array) {
            risultato += current;
        }
        return risultato;
    }

    public static Double sottrazione(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double sottrazione(Double num1, Double num2, Double num3) {
        return num1 - num2 - num3;
    }

    public static Double sottrazione(Double num1, Double[] array) {
        double risultato = num1;
        for (Double current : array) {
            risultato -= current;
        }
        return risultato;
    }

    public static Double moltiplicazione(Double num1, Double num2) {
        return num1 * num2;
    }

    public static Double moltiplicazione(Double num1, Double num2, Double num3) {
        return num1 * num2 * num3;
    }

    public static Double moltiplicazione(Double num1, Double[] array) {
        double risultato = num1;
        for (Double n : array) {
            risultato *= n;
        }
        return risultato;
    }

    public static Double divisione(Double num1, Double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisione per zero");
        }
        return num1 / num2;
    }

    public static Double divisione(Double num1, Double num2, Double num3) {
        if (num2 == 0 || num3 == 0) {
            throw new ArithmeticException("Divisione per zero");
        }
        return num1 / num2 / num3;
    }

    public static Double divisione(Double num1, Double[] array) {
        double risultato = num1;
        for (Double current : array) {
            if (current == 0) {
                throw new ArithmeticException("Divisione per zero");
            }
            risultato /= current;
        }
        return risultato;
    }

}
