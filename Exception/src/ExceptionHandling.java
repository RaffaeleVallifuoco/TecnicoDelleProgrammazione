import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    // DIUISIONE

    public static Double divisioneZero(Double num1, Double num2) {
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Divisione per zero non consentita");
            }
            return num1 / num2;
        } catch (

        ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        return null;
    }

    // INSERIMENTO NUMERO

    public static void inserisciNumero() {
        Scanner scanner = new Scanner(System.in);
        Double num;

        boolean valid = false;

        while (valid == false) {
            System.out.print("Inserisci un numero decimale: ");
            try {
                if (scanner.hasNextDouble()) {
                    num = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Hai inserito: " + num);
                    valid = true;
                } else {
                    throw new InputMismatchException("Non hai inserito un numero") {
                        // @Override
                        // public void printStackTrace() {
                        // super.printStackTrace();
                        // scanner.close();
                        // }
                    };
                }
            } catch (InputMismatchException e) {
                System.out.println("Errore: " + e.getMessage());
                scanner.nextLine();
            }

        }
    }

    // STAMPA ARRAY

    public static void stampaArray(double[] arrayNumeri) {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Elemento " + i + ": " + arrayNumeri[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("l'array ha meno di 5 elementi \n : " + arrayNumeri.length);
        }
    }

    // CAST INTERO
    public static void castStringa() {

        int num = 222;
        Object obj = (Object) num;

        try {
            String numeroStringa = (String) obj;
            System.out.println(numeroStringa);
        } catch (ClassCastException e) {
            System.out.println("Impossibile convertire un intero in una stringa.");
        } finally {
            // System.out.println(num.toString());
        }
    }
}
