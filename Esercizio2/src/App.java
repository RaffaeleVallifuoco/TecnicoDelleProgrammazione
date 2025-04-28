
import animali.Cane;
import animali.Gatto;
import matematica.EsempioDivisione;
import matematica.EsempioMoltiplicazione;
import matematica.EsempioSomma;
import matematica.EsempioSottrazione;

public class App {
    public static void main(String[] args) throws Exception {

        // ANIMALI

        Cane myDog = new Cane("Rodolfo");
        Gatto myCat = new Gatto("Gertrude");

        System.out.println("--------------------");
        System.out.println(myDog.bau());
        System.out.println("--------------------");
        System.out.println(myCat.miao());
        System.out.println("--------------------");

        // OPERAZIONI

        EsempioSomma somma = new EsempioSomma(12.4, 33.33);
        EsempioSottrazione sottrazione = new EsempioSottrazione(24, 1.09);
        EsempioMoltiplicazione moltiplicazione = new EsempioMoltiplicazione(5.00, 5.25);
        EsempioDivisione divisione = new EsempioDivisione(144.5, 2);

        somma.sum();
        sottrazione.diff();
        moltiplicazione.product();
        divisione.division();

        System.out.println("--------------------");
        treStringhe("prima Stringa", "seconda Stringa", "terza stringa");

        System.out.println("--------------------");
        chiama("0817722338");
        System.out.println("--------------------");

    }

    // METODI PER STRINGHE E NUMERO TTELEFONO

    private static void treStringhe(String first, String second, String third) {

        System.out.println(third + "\n" + second + "\n" + first + "\n");

    }

    private static void chiama(String numero) {
        System.out.println(String.format("Sto chimando il numero  %s", numero));
    }
}
