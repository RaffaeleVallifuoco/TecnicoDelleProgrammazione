package coffee;

public class TestMacchinaCaffe {

    public static void main(String[] args) {

        System.out.println("------ TEST CAFFE' -------");

        MacchinaCaffe nespresso = new MacchinaCaffe("Nespresso", "Inissia", 1000, 4);

        nespresso.eroga("espresso");
        nespresso.eroga("espresso");
        nespresso.eroga("espresso");
        nespresso.eroga("espresso");
        nespresso.eroga("espresso");
        nespresso.eroga("espresso");
        nespresso.svuota();
        nespresso.eroga("espresso");

    }

}
