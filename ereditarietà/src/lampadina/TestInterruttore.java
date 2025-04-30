package lampadina;

import java.util.Scanner;

public class TestInterruttore {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Lampadina studio = new Lampadina(4);
        Lampadina salotto = new Lampadina(4);
        Interruttore interruttoreStudio = new Interruttore(studio);
        Interruttore interruttoreSalotto = new Interruttore(salotto);

        int choice;
        do {
            System.out.println("\u001B[34m \n--- MENU ---\n \u001B[0m");
            System.out.println("1 - Click Interruttore Studio");
            System.out.println("2 - Click Interruttore Salotto");
            System.out.println("3 - Verifica stato lampadina");
            System.out.println("4 - Attacca la corrente");
            System.out.println("5 - Stacca la corrente");
            System.out.println("0 - Esci");
            System.out.print("\nCosa vuoi fare : \u001B[36m \n");

            choice = scan.nextInt();

            System.out.println("\u001B[33m\nEseguo...\u001B[0m");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            switch (choice) {
                case 1 -> interruttoreStudio.usa();
                case 2 -> interruttoreSalotto.usa();
                case 3 -> System.out.println(String.format(
                        "La lampadina dello studio è : %s \nLa lampadina del salotto è : %s",
                        studio.checkStato(), salotto.checkStato()));
                case 4 -> Lampadina.setPresenzaRete(true);
                case 5 -> {
                    Lampadina.setPresenzaRete(false);
                    salotto.spegni();
                    ;
                    studio.spegni();
                    ;
                }

                case 0 -> System.out.println("\nUscita in corso....\n\n");
                default -> System.out.println("\u001B[31mScelta non valida\u001B[0m");
            }

        } while (choice != 0);

        scan.close();
    }
}
