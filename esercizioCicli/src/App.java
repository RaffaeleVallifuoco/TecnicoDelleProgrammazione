public class App {
    public static void main(String[] args) throws Exception {

        // 1.Creare una classe Java che, a partire da 4 variabili che contengono la
        // lunghezza dei lati di un quadrilatero, stampi a schermo se la figura
        // geometrica in questione è un quadrato, oppure no.

        System.out.println("----------------------------------");
        System.out.println("\nCONTROLLO QUADRATO");

        Quadrato square = new Quadrato(2, 2, 3, 2);
        System.err.println(square.check(square));

        System.out.println("----------------------------------");

        // 2.Creare una classe Java che, a partire da 3 variabili che contengono la
        // lunghezza dei lati di un triangolo, stampi a schermo se il triangolo in
        // questione è equilatero, isoscele o scaleno.

        System.out.println("----------------------------------");
        System.out.println("\nCONTROLLO TRIANGOLO\n");

        Triangolo triangle = new Triangolo(11.2, 10.0, 9.2);
        System.err.println(triangle.check(triangle));

        System.out.println("----------------------------------");

        // 3.Creare una classe Java che, con l’aiuto di una variabile numerica, stampi
        // il numero se il numero è compreso tra-10 e 10, oppure stampi “errore”.

        System.out.println("----------------------------------");
        System.out.println("\nNUM COMPRESO\n");

        double number = 4.4;
        if (number >= -10 && number <= 10) {
            System.out.println(number + " è compreso nell'intervallo");
        } else
            System.out.println(number + " non è compreso nell'intervallo");

        System.out.println("----------------------------------");

        // 4.Creare una classe Java che controlli un carattere. Stampare a schermo se si
        // tratta di una vocale o di una consonante.

        System.out.println("----------------------------------");

        System.out.println("\nCONTROLLO CARATTERE\n");
        char character = 'f';
        char c = Character.toLowerCase(character);

        if (Character.isLetter(c)) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(c + " è una vocale.");
                    break;
                default:
                    System.out.println(c + " è una consonante.");
            }
        } else {
            System.out.println(c + " non è una lettera.");
        }

        System.out.println("----------------------------------");

        // 5.Crea una classe Java che stampi a schermo i numeri da 1 a 10. Utilizza sia
        // un ciclo while, sia un ciclo for.

        System.out.println("----------------------------------");
        System.out.println("\nNUMERI 1-10 for\n");

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        System.out.println("\nNUMERI 1-10 while\n");

        int i = 0;
        while (i < 10) {
            System.out.println(i + 1);
            i++;
        }

        System.out.println("----------------------------------");

        // 6.Creare una classe Java che stampi a schermo i numeri da 10 a 0. Utilizza
        // sia un while che un ciclo for.

        System.out.println("----------------------------------");
        System.out.println("\nNUMERI 10 - 0 for\n");

        for (int j = 10; j >= 1; j--) {
            System.out.println(i);
        }

        System.out.println("\nNUMERI 10 - 0 while\n");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        System.out.println("----------------------------------");

        // 7.Creare una classe Java che stampi a schermo i numeri pari da 0 a -10.
        // Utilizza sia un while che un ciclo for.

        System.out.println("----------------------------------");

        System.out.println("\nNUMERI PARI 0 - -10 for\n");

        for (int z = 0; z >= -10; z--) {
            if (z % 2 == 0) {
                System.out.println(z);
            }
        }

        System.out.println("\nNUMERI PARI 0 - -10 WHILE\n");
        int m = 0;
        while (m >= -10) {
            if (m % 2 == 0) {
                System.out.println(m);
            }
            m--;
        }

        System.out.println("----------------------------------");

        // 8.Creare una classe Java che stampi a schermo i numeri dispari da -1 a 20.
        // Utilizza sia un ciclo while, sia un ciclo for.

        System.out.println("----------------------------------");
        System.out.println("\nNUMERI DISPAARI -1 - 20 for\n");

        for (int z = -1; z <= 20; z++) {

            System.out.println(z);

        }

        System.out.println("\nNUMERI DISPAARI -1 - 20 WHILE\n");
        int p = -1;
        while (p <= 20) {

            System.out.println(p);

            p++;

        }
        System.out.println("----------------------------------");

        // 9.Creare una classe Java che stampi a schermo la somma dei numeri da 1 a 10.
        // Utilizza sia un ciclo while, sia un ciclo for.

        System.out.println("----------------------------------");
        System.out.println("\nDOMMA NUMERI 1 - 10\n");

        System.out.println("somma");
        int sum = 0;

        for (int w = 0; w < 10; w++) {
            sum += w;
            System.out.println(sum);
        }

        int w = 0;
        int somma = 0;
        while (w < 10) {
            somma += w;
            System.out.println(somma);
            w++;
        }

        System.out.println("----------------------------------");

        // 10.Creare una classe Java che stampi a schermola tabellina di un numero a
        // piacere da 1 a 10.

        System.out.println("----------------------------------");

        System.out.println("\nTABELLINAA\n");

        int numero = 3;
        for (int k = 0; k <= 10; k++) {
            System.out.println(numero + " x " + k + " = " + (numero * k));
        }

    }

}
