package lampadina;

import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\n \u001B[34m--------- BENVENUTO ----------- \n \u001B[0m");
        System.out.print("\nInserisci il umero massimo di click prima che la lampadina si rompa: \n");
        System.out.println("\u001B[32m");
        int maxClick = scan.nextInt();
        System.out.println("\u001B[0m");

        Lampadina lampadina = new Lampadina(maxClick);
        int scelta;

        do {
            System.out.println("\n La lampadina è " + lampadina.checkStato());
            System.out.println("\nCosa vuoi fare?\n");
            System.out.println("1 - Cambia stato (click)");
            System.out.println("2 - Mostra stato");
            System.out.println("0 - Esci");
            System.out.print("\nScelta: \n");
            System.out.println("\u001B[32m");
            scelta = scan.nextInt();
            System.out.println("\u001B[0m");

            switch (scelta) {
                case 1:
                    lampadina.click();
                    break;
                case 0:
                    System.out.println(
                            "\u001B[34m Uscita in corso.... è stato un piacere fulminare lampadine con  te \n\n\n\n\n");
                    break;
                default:
                    System.out.println("\u001B[31m Scelta non valida \u001B[0m");
            }
        } while (scelta != 0);

        scan.close();
    }
}
