package cellulare;

public class EsempioCellulare {
    public static void main(String[] args) {

        Cellulare telefono = new Cellulare("333777999", 10.00, "Vodafone");
        System.out.println("\n Dettagli teleno : " + telefono.toString());
        System.out.println(String.format("\n Il credito residuo è %f €\n", telefono.getCreditoResiduo()));
        telefono.chiama("1112223334");
        telefono.getCreditoResiduo();
        telefono.chiama("9999888876");
        System.out.println(String.format("\n L'ultimo  umero chiamato è  %s \n", telefono.getUltimoChiamato()));
        telefono.richiama();
        System.out.println(String.format("\n Il credito residuo è %f €\n", telefono.getCreditoResiduo()));

    }

}
