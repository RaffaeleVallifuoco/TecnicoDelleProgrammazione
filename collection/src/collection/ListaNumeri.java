package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ListaNumeri {

    // LISTA

    public static void lista() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();

        System.out.println("Inserisci gli interi che vuoi collezionare. \n(Digita 0 per terminare inserimento):");

        while (true) {
            System.out.print("Numero: ");

            // String input = scanner.nextLine();

            // if (input.equalsIgnoreCase("stop")) {
            // break;
            // }

            // try {
            // int numero = Integer.parseInt(input);
            // numeri.add(numero);
            // } catch (NumberFormatException e) {
            // System.out.println("Input non valido. Inserisci un numero intero");

            int input = scanner.nextInt();

            if (input == 0) {

                break;
            }

            try {
                numeri.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero intero");
            }
        }

        System.out.println("\nNumeri insert:");
        for (int i = 0; i < numeri.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeri.get(i));
        }

    }

    // SET

    public static void set() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeri = new ArrayList<>();

        System.out.println("Inserisci gli interi che vuoi collezionare. \n(Digita 0 per terminare inserimento):");

        while (true) {
            System.out.print("Numero: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            try {
                numeri.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Input non valido. Inserisci un numero intero");
            }
        }

        System.out.println("\nNumeri insert:");
        for (int i = 0; i < numeri.size(); i++) {
            System.out.println("Elemento " + (i + 1) + ": " + numeri.get(i));
        }

    }

    // MAP

    public static void map() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> mappa = new HashMap<>();

        System.out.println("Inserisci 3 coppie key-value (intero , stringa):");

        int insert = 0;
        while (insert < 3) {
            try {
                System.out.print("Chiave " + (insert + 1) + ": ");
                int key = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Inserisci la stringa per la chiave " + key + ": ");
                String value = scanner.nextLine();

                if (mappa.containsKey(key)) {
                    System.out.println("\nAttenzione, hiave già presente. Inserisci una chiave diversa\n");
                } else {
                    mappa.put(key, value);
                    insert++;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nAttenzione, la chiave deve essere un intero\n");
                scanner.next();
            }
        }

        System.out.println("\n - MAPPA : - \n: " + mappa);

        System.out.print("Inserisci la chiave da trovare");
        try {
            int request = scanner.nextInt();
            if (mappa.containsKey(request)) {
                System.out
                        .println("Valore associato alla key " + request + ": " + mappa.get(request));
            } else {
                System.out.println("\n ATTENZIONE, valore non trovato\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input non valido, inserisci un numero intero.");
        }

    }
}
