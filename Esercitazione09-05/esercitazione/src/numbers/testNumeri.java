package numbers;

public class testNumeri {
    public static void main(String[] args) throws Exception {
        System.out.println("\n----- TEST LISTA NUMERI ------\n");

        Numeri.inserisciNumeri();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n----- TEST LISTA NUMERI 2------\n");

        Numeri.inputNumeri();
        ;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n----- TEST NUMERI POSITIVI ------\n");

        Numeri.numeriPositivi();
    }

}
