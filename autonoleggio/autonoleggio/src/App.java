import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import flotta.Automobile;
import flotta.Furgone;
import flotta.Motociclo;
import flotta.Veicolo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------- AUTONOLEGGIO ------ \n");

        Scanner scanner = new Scanner(System.in);

        List<Veicolo> flottaVeicoli = new ArrayList<>();
        flottaVeicoli.add(new Furgone("Iveco TurboDaily", "AA111BB", 1989, 20.60, 1200));
        flottaVeicoli.add(new Automobile("Renault Clio", "CC222DD", 2017, 15.99, 5));
        flottaVeicoli.add(new Motociclo("Kawasaki Ninja", "EE333FF", 2004, 15.90, 800));

        boolean condizione = false;

        while (!condizione) {
            try {
                System.out.println(
                        "\nCosa vuoi fare: \n1) Visualizza flotta veicoli\n2) Aggiungi un veicolo alla flotta\n3) Rimuovi un veicolo dalla flotta\n4) Visualizza info noleggio\n5) Modifica disponibilità veicolo\n");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        // Visualizza flotta
                        System.out.println("\nFlotta veicoli:");
                        for (int i = 0; i < flottaVeicoli.size(); i++) {
                            System.out.println(i + ") " + flottaVeicoli.get(i));
                        }
                        System.out.println("\n--- OPERAZIONE EFFETTUATA CON SUCCESSO ---");
                    }
                    case 2 -> {
                        // Aggiungi veicolo
                        System.out.println("\nChe tipo di veicolo vuoi aggiungere?");
                        System.out.println("1) Furgone\n2) Automobile\n3) Motociclo");
                        int tipoVeicolo = scanner.nextInt();
                        scanner.nextLine(); // Consuma newline

                        System.out.print("Marca: ");
                        String marca = scanner.nextLine();

                        System.out.print("Targa: ");
                        String targa = scanner.nextLine();

                        System.out.print("Anno immatricolazione: ");
                        int anno = scanner.nextInt();

                        System.out.print("Tariffa giornaliera: ");
                        double tariffa = scanner.nextDouble();

                        switch (tipoVeicolo) {
                            case 1 -> {
                                System.out.print("Capacità di carico (kg): ");
                                int capacitaCarico = scanner.nextInt();
                                flottaVeicoli.add(new Furgone(marca, targa, anno, tariffa, capacitaCarico));
                            }
                            case 2 -> {
                                System.out.print("Numero posti: ");
                                int numPosti = scanner.nextInt();
                                flottaVeicoli.add(new Automobile(marca, targa, anno, tariffa, numPosti));
                            }
                            case 3 -> {
                                System.out.print("Cilindrata (cc): ");
                                int cilindrata = scanner.nextInt();
                                flottaVeicoli.add(new Motociclo(marca, targa, anno, tariffa, cilindrata));
                            }
                            default -> System.err.println("\nTipo veicolo non valido.");
                        }

                        System.out.println("\n--- VEICOLO AGGIUNTO CON SUCCESSO ---");
                    }
                    case 3 -> {
                        // Rimuovi veicolo
                        System.out.println("\nFlotta attuale:");
                        for (int i = 0; i < flottaVeicoli.size(); i++) {
                            System.out.println(i + ") " + flottaVeicoli.get(i));
                        }

                        System.out.print("\nInserisci l'indice del veicolo da rimuovere: ");
                        int indexToRemove = scanner.nextInt();

                        if (indexToRemove >= 0 && indexToRemove < flottaVeicoli.size()) {
                            Veicolo rimosso = flottaVeicoli.remove(indexToRemove);
                            System.out.println("\nVeicolo rimosso: " + rimosso);
                            System.out.println("\n--- OPERAZIONE EFFETTUATA CON SUCCESSO ---");
                        } else {
                            System.err.println("\nIndice non valido!");
                        }
                    }
                    case 4 -> {
                        // Calcola noleggio
                        System.out.println("\nSeleziona il veicolo per cui calcolare il noleggio:");
                        for (int i = 0; i < flottaVeicoli.size(); i++) {
                            System.out.println(i + ") " + flottaVeicoli.get(i));
                        }

                        System.out.print("\nInserisci l'indice del veicolo: ");
                        int index = scanner.nextInt();

                        if (index >= 0 && index < flottaVeicoli.size()) {
                            System.out.print("Inserisci il numero di giorni di noleggio: ");
                            int giorni = scanner.nextInt();

                            flottaVeicoli.get(index).calcolaNoleggio(giorni);
                            System.out.println("\n--- CALCOLO COMPLETATO ---");
                        } else {
                            System.err.println("\nIndice non valido!");
                        }
                    }
                    case 5 -> {
                        System.out.println("\nFlotta attuale:");
                        for (int i = 0; i < flottaVeicoli.size(); i++) {
                            System.out.println(i + ") " + flottaVeicoli.get(i));
                        }

                        System.out.print("\nInserisci l'indice del veicolo da modificare: ");
                        int index = scanner.nextInt();

                        if (index >= 0 && index < flottaVeicoli.size()) {
                            Veicolo veicolo = flottaVeicoli.get(index);
                            boolean statoAttuale = veicolo.isDisponibile();
                            veicolo.setDisponibile(!statoAttuale);
                            System.out.println(
                                    "\nIl veicolo è ora "
                                            + (veicolo.isDisponibile() ? "DISPONIBILE" : "NON DISPONIBILE"));
                        } else {
                            System.err.println("Indice non valido.");
                        }
                    }
                    default -> System.err.println("\nAttenzione! Scelta non corretta\n");
                }

            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("\n \u001B[31m\"Input non valido ! Inserisci un input corretto \n \u001B[0m");
            }
            scanner.nextLine();

            // DOMANDA FINALE
            System.out.print("\nVuoi effettuare un'altra operazione? (s/n): ");
            String risposta = scanner.nextLine().trim().toLowerCase();
            if (!risposta.equals("s")) {
                condizione = true;
                System.out.println("\nGrazie per aver usato il sistema di autonoleggio. Arrivederci!\n\n");
            }
        }
    }
}