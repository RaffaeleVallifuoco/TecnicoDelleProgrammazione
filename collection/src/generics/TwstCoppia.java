package generics;

import java.util.Scanner;

public class TwstCoppia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // COPPIA GENERICA DELLO STESSO TIPO

        System.out.println("\n------ COPPIA ------\n");
        System.out.println("\nChe tipo di elementi vuoi inserire :\n1) Stringa \n2) intero\n");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // DICHIARO UN OGGETTO COPPIA E LASCIO L'INIZIALIZZAZIONE AGLI SWITCH

        Coppia coppia;

        switch (choice) {
            case 1 -> {
                System.out.println("\nInserisci il primo elemento della coppia");
                String uno = scanner.nextLine();
                System.out.println("\nInserisci il secondo elemento della coppia");
                String due = scanner.nextLine();
                coppia = new Coppia<String>(uno, due);
                // RICHIAMO I METODI E STAMPPO LA COPPIA (NO TOSTRING)
                System.out.println("\nEcco la coppia :\n");
                System.out.println(coppia.getUno());
                System.out.println(coppia.getDue());

                break;
            }
            case 2 -> {
                System.out.println("\nInserisci il primo elemento della coppia");
                Integer uno = scanner.nextInt();
                scanner.nextLine();
                System.out.println("\nInserisci il secondo elemento della coppia");
                Integer due = scanner.nextInt();
                scanner.nextLine();
                coppia = new Coppia<Integer>(uno, due);

                // RICHIAMO I METODI E STAMPPO LA COPPIA (NO TOSTRING)

                System.out.println("\nEcco la coppia :\n");
                System.out.print(coppia.getUno());
                System.out.print(coppia.getDue());

                break;
            }

            default -> {
                break;
            }

        }

        // PAUSA

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // COPPIA MISTA GENERICA

        System.out.println("\n\n------ COPPIA MISTA ------\n");

        // INIZIALIZZO UNA COPPIA CON COSTRUTTORE VUOTO
        // SETTO POI I PARAMETRI NELLO SWITCH

        Coppia coppiaMista = new Coppia<>();

        // TIPO 2
        System.out.println("\nScegli il tipo per il PRIMO elemento:");
        System.out.println("1) Stringa\n2) Intero\n");
        int choiceUno = scanner.nextInt();
        scanner.nextLine();

        switch (choiceUno) {
            // TIPO 1 STRINGA
            case 1 -> {
                System.out.print("Inserisci una stringa: ");
                String uno = scanner.nextLine();
                coppiaMista.setUno(uno);
            }
            // TIPO 1 INTERO
            case 2 -> {
                System.out.print("Inserisci un intero: ");
                Integer uno = scanner.nextInt();
                scanner.nextLine();
                coppiaMista.setUno(uno);
            }
            default -> {
                break;
            }
        }

        System.out.println("\nScegli il tipo per il SECONDO elemento:");
        System.out.println("1) Stringa\n2) Intero\n3) Booleano");
        int choiceDue = scanner.nextInt();
        scanner.nextLine();

        // TIPO 2

        switch (choiceDue) {
            // TIPO 2 STRINGA
            case 1 -> {
                System.out.print("Inserisci una stringa: ");
                String due = scanner.nextLine();
                coppiaMista.setDue(due);
            }
            // TIPO 2 INTERO
            case 2 -> {
                System.out.print("Inserisci un intero: ");
                Integer due = scanner.nextInt();
                scanner.nextLine();
                coppiaMista.setDue(due);
            }
            default -> {
                break;
            }
        }

        // RICHIAMO I METODI E STAMPPO LA COPPIA (NO TOSTRING)

        System.out.println("\nEcco la coppia\n");
        System.out.println(coppiaMista.getUno());
        System.out.println(coppiaMista.getDue());

    }

}
