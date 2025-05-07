public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n Hello, Exception ! \n");

        System.out.println("\n Eccezione divisione \n");
        System.out.println(ExceptionHandling.divisioneZero(12.0, 2.0));
        System.out.println(ExceptionHandling.divisioneZero(12.0, 0.0));

        System.out.println("\n Eccezione numero lettera ! \n");
        ExceptionHandling.inserisciNumero();

        System.out.println("\n Eccezione stamp array ok ! \n");
        ExceptionHandling.stampaArray(new double[] { 0.9, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0 });

        System.out.println("\n Eccezione stampa array non ok ! \n");
        ExceptionHandling.stampaArray(new double[] { 0.9, 1.0 });

        System.out.println("\n Eccezione cast \n");
        ExceptionHandling.castStringa();

    }
}
