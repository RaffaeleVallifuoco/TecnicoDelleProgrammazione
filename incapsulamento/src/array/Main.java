package array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array array = new Array();
        array.stampa();
        System.out.println("\n ------------------------ \n ");
        System.out.print("  n Inserisci un numero da cercare nell'array: ");
        int numero = scanner.nextInt();
        array.find(numero);
        array.contieneNegativi();
        array.somma();
        scanner.close();
    }
}