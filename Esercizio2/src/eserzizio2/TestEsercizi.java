package eserzizio2;

public class TestEsercizi {

    public static void main(String[] args) {

        // VIAGGIO

        Viaggio trip = new Viaggio("Londra", 120, 220);
        trip.stampaInfo();

        System.err.println("-------------------------------");

        // STAMPA GENERALITA'

        stampa("\n Raffaele ", "Vallifuoco\n ");

        System.err.println("-------------------------------");

        // CONVERSIONE

        System.out.println(convertiInDouble(398));

        System.err.println("-------------------------------");

        // APPROSSIMATO

        sommaApprossimata(112.1, 34.8);

    }

    // METODI STATICI

    public static void stampa(String nome, String cognome) {
        System.out.println(nome + cognome);
    }

    public static double convertiInDouble(int numero) {
        return (double) numero;
    }

    public static void sommaApprossimata(double num1, double num2) {
        int rotondo = (int) Math.round(num1 + num2);
        System.err
                .println(String.format("\n nnumeri in input : %f, %f\n somma arrotondata %d \n", num1, num2, rotondo));
    }
}
