package esempiCorso;

public class Test {

    public static void main(String[] args) throws Exception {

        Studente studente1 = new Studente("Raff", 29, "tecnico Della Programmazione");

        System.out.println(String.format("\n \n Lo studente %s frequenta %s di %d ore \n \n", studente1.nome,
                studente1.corsoDiStudi, Studente.numeroOre));

        Differenza diffNumeri = new Differenza(100.0, 21.7, 30.9);

        System.out.println(diffNumeri + "\n");

        // proviamo con i gatti

        Gatto gatto1 = new Gatto();
        Gatto gatto2 = new Gatto("AAron", "tappeto", 18);
        Gatto gatto3 = new Gatto("Randagio");

        gatto1.nome = "Giottto";
        gatto1.razza = "siamese";
        gatto1.age = 5;

        System.out.println("\n " + gatto1.nome + "\n");
        System.out.println(gatto1);
        System.out.println(gatto2);
        System.out.println(gatto3);                                                  

    }

}
