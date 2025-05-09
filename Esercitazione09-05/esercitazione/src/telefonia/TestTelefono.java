package telefonia;

public class TestTelefono {
    public static void main(String[] args) {

        System.out.println("\n----- TELEFONO ------\n");

        ContrattoTelefonico vodafoneFisso = new ContrattoFisso("Raff", "222333444", "via privata");
        spazio();
        System.out.println("\nUtente : ");
        System.out.println(vodafoneFisso.getUsername());
        vodafoneFisso.telefona(1123);
        System.out.println("\nCOsto bolletta :");
        System.out.println(vodafoneFisso.getBolletta());
        spazio();
        ContrattoTelefonico vodafoneMobile = new ContrattoMobile("Raffo", "333444555");
        spazio();
        System.out.println("\nUtente : ");
        System.out.println(vodafoneMobile.getUsername());
        vodafoneMobile.telefona(1123);

        System.out.println("\nCOsto bolletta : ");
        System.out.println(vodafoneMobile.getBolletta());
        spazio();

    }

    // STAMPA SPAZIO VUOTO

    public static void spazio() {
        System.out.println(" ");
    }

}
