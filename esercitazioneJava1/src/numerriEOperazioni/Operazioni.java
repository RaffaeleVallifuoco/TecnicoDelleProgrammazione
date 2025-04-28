package numerriEOperazioni;

public class Operazioni {

    // ---------------------------------
    // ------------- METHODS -----------
    // ---------------------------------

    public static double somma(double num1, double num2) {
        return num1 + num2;
    }

    public static double sottrazione(double num1, double num2) {
        return num1 - num2;
    }

    public static double moltiplicazione(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisione(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisione per zero non permessa!");
        }
        return num1 / num2;
    }

    public static String checkNumber(double num1, double num2) {

        String risultato = (num1 > num2) ? "Il primo numero è maggiore del secondo."
                : "Il primo numero NON è maggiore del secondo.";

        return risultato;

    }

    public static String checkOrder(double num1, double num2, double num3) {

        String risultato = (num1 > num2 && num2 > num3) ? "Inumeri sono in ordine crescente."
                : "Inumeri non sono in ordine crescente.";

        return risultato;

    }

    public static String checkSomma(double num1, double num2) {
        if ((num1 + num2) > 100) {
            return String.format("La somma di %f e %f è maggiore di 100 \n", num1, num2);
        } else
            return String.format("La somma di %f e %f è minore di 100 \n", num1, num2);
    }

    public static void checkRange(int numero) {
        if (numero >= 0 && numero <= 10) {
            System.out.println("Numero valido: " + numero);
        } else {
            System.err.println("Errore: numero fuori dal range 0 - 10");
        }

    }

    public static void stampaPariFor() {
        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void stampaPariWhile() {
        int i = 1;
        while (i <= 14) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void stampaDispariWhile() {
        int i = 14;
        while (i >= -3) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }
    }

    public static void stampaDispariFor() {
        for (int i = 14; i >= -3; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void tabelline() {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(String.format("Tabellina del %d ;\n", numero));
            for (int k = 0; k <= 10; k++) {
                System.out.println(numero + " x " + k + " = " + (numero * k + ""));
            }
            System.out.println("\n");
        }
    }

    public static double media(double num1, double num2, double num3) {
        {
            return (num1 + num2 + num3);
        }

    }

    public static void check5(int numero) {
        String risultato = (numero % 5 == 0)
                ? numero + " è un multiplo di 5."
                : numero + " non è un multiplo di 5.";
        System.out.println(risultato);
    }

    public static void stampaNumeri() {
        for (int i = 1; i <= 100; i++) {
            if (i == 10 || i == 30 || i == 50) {
                System.out.println("\n");
                continue;
            }
            System.out.println(i);
        }
    }
}