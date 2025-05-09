package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numeri {

    // LISTA NUMERI

    public static void inserisciNumeri() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeri = new ArrayList<>();
        boolean stop = false;
        Double input;
        Double last = null;
        double sum = 0.0;
        double avg;
        int counter = 0;

        System.out.println("\nInserisci numeri in ordine decrescente\n");

        while (!stop) {
            System.out.print("Numero " + counter + ": ");
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();

                if (last == null || input <= last) {
                    numeri.add(input);
                    last = input;
                    counter++;
                } else {
                    System.out.println("\nImmissione terminata\n");
                    stop = true;
                }
            } else {
                System.out.println("\nImmissione terminata\n");
                stop = true;
            }

        }

        for (Double num : numeri) {
            sum += num;
        }

        avg = sum / numeri.size();
        System.out.printf("La somma dei numeri è: %.2f\n", sum);
        System.out.printf("La media dei numeri è: %.2f\n", avg);

    }

    // LISTA NUMERI 2

    public static void inputNumeri() {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeri = new ArrayList<>();
        Double sum = 0.0;
        Double avg;
        Double max = null;
        int counter = 0;
        boolean stop = false;

        System.out.println("\nInserisci numeri. Digita una lettera per terminare:\n");

        while (!stop) {
            System.out.print("Numero " + counter + ": ");
            if (scanner.hasNextDouble()) {
                Double input = scanner.nextDouble();
                numeri.add(input);
                sum += input;
                if (max == null || input > max) {
                    max = input;
                }
                counter++;
            } else {
                stop = true;
                scanner.next();
                System.out.println("\nImmissione terminata\n");
            }
        }
        avg = sum / numeri.size();
        System.out.printf("Il numero massimo è: %.2f\n", max);
        System.out.printf("La media dei numeri è: %.2f\n", avg);

    }

    // LISTA NUMERI POSITIVI

    public static void numeriPositivi() {

        Scanner scanner = new Scanner(System.in);
        List<Double> numeri = new ArrayList<>();
        List<Double> multipli = new ArrayList<>();
        List<Double> nonMultipli = new ArrayList<>();
        Double input;
        boolean stop = false;

        System.out.println("\nInserisci numeri positivi (termina inserendo un numero negativo\n):");

        while (!stop) {
            System.out.print("Numero: ");
            input = scanner.nextDouble();
            if (input < 0) {
                stop = true;
                break;
            }
            numeri.add(input);
        }

        if (numeri.isEmpty()) {
            System.out.println("Non hai inserito nessun numero positivo");
            return;
        }

        System.out.print("Di quale numero stai cercando i multipli ?");
        int n = scanner.nextInt();

        for (double current : numeri) {
            if (current % n == 0) {
                multipli.add(current);
            } else {
                nonMultipli.add(current);
            }
        }

        System.out.println("Lista dei SOLI multipli di " + n + ": " + multipli);
        System.out.println("\nLista SENZA multipli di " + n + ": " + nonMultipli);
        System.out.println(" ");

    }

}
