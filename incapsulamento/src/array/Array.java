package array;

public class Array {

    private int[] numeri = { 1, 25, -4, 36, 0, -1, -4, 27, 3, -1, -1, 52 };

    public void stampa() {
        System.out.println("\n Array : \n");
        for (int numero : numeri) {
            System.out.print(numero + " ,");
        }
    }

    public void find(int numero) {
        boolean trovato = false;
        for (int n : numeri) {
            if (n == numero) {
                trovato = true;
                break;
            }
        }
        if (trovato) {
            System.out.println(String.format("\n Il numero %d è presente \n", numero));
            contaOccorrenze(numero);
        } else {
            System.out.println(String.format("\n Il numero %d non è presente \n", numero));
        }
    }

    public void contaOccorrenze(int numero) {
        int counter = 0;
        for (int n : numeri) {
            if (n == numero) {
                counter++;
            }
        }
        System.out.println(String.format("\n Occorrenze del numero %d: %d \n", numero, counter));
    }

    public void contieneNegativi() {
        boolean negativi = false;
        for (int n : numeri) {
            if (n < 0) {
                negativi = true;
                break;
            }
        }
        if (negativi) {
            System.out.println("\n L'array contiene numeri negativi\n ");
        } else {
            System.out.println("\n L'array non contiene numeri negativi \n");
        }
    }

    public void somma() {
        int somma = 0;
        for (int n : numeri) {
            somma += n;
        }
        System.out.println(String.format("La somma degli elementi dell'array è: %d", somma));
    }
}