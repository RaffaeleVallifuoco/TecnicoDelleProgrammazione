package studente;

public class TestStudenti {
    public static void main(String[] args) {

        System.out.println("------- TEST STUDENTI -------");

        Studente[] studenti = new Studente[5];

        studenti[0] = new Triennale("Mario", "Rossi", 9500.0, 3);
        studenti[1] = new Triennale("Luisa", "Bianchi", 20000.0, 4);
        studenti[2] = new Triennale("Luigi", "Verdi", 32000.0, 3);

        studenti[3] = new Magistrale("Sara", "Neri", 15000.0, 2);
        studenti[4] = new Magistrale("Giulia", "Gialli", 28000.0, 4);

        for (Studente student : studenti) {
            System.err.println("");
            System.out.println(student);
            System.err.println("");
        }

    }

}
