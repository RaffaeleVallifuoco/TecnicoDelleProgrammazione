import cerchio.Cerchio;
import hobby.Mac;
import numerriEOperazioni.Operazioni;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\n Esercitazione JAVA 1");
        System.out.println("--------------------------------------------- \n");

        // ESERCIZIO 1

        System.out.println("SOMMA : \n");

        double somma = Operazioni.somma(2, 2);
        double sottrazione = Operazioni.sottrazione(2, 2);
        double moltiplicazione = Operazioni.moltiplicazione(2, 2);
        double divisione = Operazioni.divisione(2, 2);

        System.err.println(String.format(
                "OERAZIONI : \n somma : %f \n Sottrazione %f \n Moltiplicazione %f \n Divisione %f \n", somma,
                sottrazione, moltiplicazione, divisione));

        System.out.println("--------------------------------------------- \n");

        // ESERCIZIO 2

        System.out.println("CONTROLLO MAGGIORE : \n");
        String checkNumber = Operazioni.checkNumber(5, 4.2);
        System.out.println(checkNumber);

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 3

        System.out.println("CONTROLLO ORDINE :\n");
        String checkOrder = Operazioni.checkOrder(5, 4.2, 8);
        System.out.println(checkOrder);

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 4

        System.out.println("CONTROLLO SOMMA :\n");
        String checkSomma = Operazioni.checkSomma(78, 99);
        System.out.println(checkSomma);

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 5

        System.out.println("CONTROLLO RANGE :\n");
        Operazioni.checkRange(9);

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 6

        System.out.println("STAMPA PARI : \n");
        System.out.println("\nFOR : \n");
        Operazioni.stampaPariFor();
        System.out.println("\nWHILE : \n");
        Operazioni.stampaPariWhile();

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 7

        System.out.println("STAMPA DISPARI : \n");
        System.out.println("\nFOR : \n");
        Operazioni.stampaDispariFor();
        System.out.println("\nWHILE : \n");
        Operazioni.stampaDispariWhile();

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 8

        System.out.println("TABELLINE : \n");
        Operazioni.tabelline();

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 9

        System.out.println("MEDIA : \n");
        double media = Operazioni.media(12, 0.00, 1.14);
        System.err.println(String.format("La mediaa è : %2f \n", media));

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 10

        System.out.println("MULTIPLO % : \n");

        Operazioni.check5(25);

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 11

        System.out.println("NUMERI 0 - 100 TRANNE 10, 30, 40 % : \n");

        Operazioni.stampaNumeri();

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 12

        System.out.println("CERCHIO :\n");

        double circonferenza = Cerchio.circonferenza(3);
        System.err.println(String.format("La circonferenza del cerhio è : %2f \n", circonferenza));
        double areaa = Cerchio.areaCerchio(3);
        System.err.println(String.format("La circonferenza del cerhio è : %2f \n", areaa));

        System.out.println("\n--------------------------------------------- \n");

        // ESERCIZIO 13

        System.out.println("HOBBY : \n");

        Mac raffoMacbook = new Mac("Macbook pro M1", "is009dhndn5773l", 13, "M1");
        Mac raffoMac = new Mac();
        raffoMac.setModelName("Mac mini M4");
        raffoMac.setSocType("M4");
        raffoMac.setProductCode("IS9922JHHD00957F0");

        System.out.println(raffoMac);
        System.out.println(raffoMacbook);

        System.out.println("\n\n ------------------------------\n\n");
        System.out.println("\n --------  END --------\n");

    }

}
