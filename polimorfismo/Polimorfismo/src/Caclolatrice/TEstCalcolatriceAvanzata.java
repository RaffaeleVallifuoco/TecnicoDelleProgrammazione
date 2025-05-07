package Caclolatrice;

public class TEstCalcolatriceAvanzata {

    public static void main(String[] args) {
        System.err.println("\n---------- TEST CALCOLATRICE -----------\n");

        System.out.println("\n------ SOMMA 2 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.somma(4.0, 1.1));

        System.out.println("\n------ SOMMA 3 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.somma(0.9, 10.0, 345.67));

        System.out.println("\n------ SOMMA ARRAY ------\n");
        System.out.println(CalcolatriceAvanzata.somma(2.445, new Double[] { 3.2, 3.3, 5.8 }));

        System.out.println("\n------ SOTTRAZIONE 2 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.sottrazione(4.0, 1.1));

        System.out.println("\n------ SOTTRAZIONE 3 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.sottrazione(4.0, 1.2, 0.8));

        System.out.println("\n------ SOTTRAZIONE ARRAY ------\n");
        System.out.println(CalcolatriceAvanzata.sottrazione(100.445, new Double[] { 3.2, 3.3, 5.8 }));

        System.out.println("\n------ MOLTIPLICAZIONE 2 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.moltiplicazione(4.0, 1.1));

        System.out.println("\n------ MOLTIPLICAZIONE 3 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.moltiplicazione(4.0, 1.1, 222.222));

        System.out.println("\n------ MOLTIPLICAZIONE ARRAY ------\n");
        System.out.println(CalcolatriceAvanzata.moltiplicazione(2.445, new Double[] { 3.2, 3.3, 5.8 }));

        System.out.println("\n------ DIVISIOne 2 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.moltiplicazione(400.00, 2.3456));

        System.out.println("\n------ DIVISIOne 3 NUMERI ------\n");
        System.out.println(CalcolatriceAvanzata.moltiplicazione(400.00, 2.3456, 3.0));

        System.out.println("\n------ DIVISIOne ARRAY ------\n");
        System.out.println(CalcolatriceAvanzata.somma(2.445, new Double[] { 100.00, 3.3, 5.8 }));

        System.err.println("\n---------- END -----------\n");

    }

}
