package corse;

import java.util.ArrayList;
import java.util.List;

public class Campionato {
    public static void main(String[] args) {

        System.out.println("\n----- CAMPIONATO F1---------\n");

        List<Car> vetture = new ArrayList<>();
        List<Pilota> piloti = new ArrayList<>();

        // Ferrari
        Car sf25 = new Car("Ferrari", "SF-25");
        vetture.add(sf25);
        piloti.add(new Pilota("Charles Leclerc", 5, sf25));
        piloti.add(new Pilota("Lewis Hamilton", 103, sf25));

        // Red Bull
        Car rb21 = new Car("Red Bull", "RB21");
        vetture.add(rb21);
        piloti.add(new Pilota("Max Verstappen", 58, rb21));
        piloti.add(new Pilota("Liam Lawson", 0, rb21));

        // Mercedes
        Car w16 = new Car("Mercedes", "W16 E Performance");
        vetture.add(w16);
        piloti.add(new Pilota("George Russell", 1, w16));
        piloti.add(new Pilota("Andrea Kimi Antonelli", 0, w16));

        // McLaren
        Car mcl39 = new Car("McLaren", "MCL39");
        vetture.add(mcl39);
        piloti.add(new Pilota("Lando Norris", 1, mcl39));
        piloti.add(new Pilota("Oscar Piastri", 0, mcl39));

        // Aston Martin
        Car amr25 = new Car("Aston Martin", "AMR25");
        vetture.add(amr25);
        piloti.add(new Pilota("Fernando Alonso", 32, amr25));
        piloti.add(new Pilota("Lance Stroll", 0, amr25));

        // Alpine
        Car a525 = new Car("Alpine", "A525");
        vetture.add(a525);
        piloti.add(new Pilota("Pierre Gasly", 1, a525));
        piloti.add(new Pilota("Franco Colapinto", 0, a525));

        // Haas
        Car vf25 = new Car("Haas", "VF-25");
        vetture.add(vf25);
        piloti.add(new Pilota("Esteban Ocon", 1, vf25));
        piloti.add(new Pilota("Oliver Bearman", 0, vf25));

        // Racing Bulls
        Car vcarb02 = new Car("Racing Bulls", "VCARB 02");
        vetture.add(vcarb02);
        piloti.add(new Pilota("Isack Hadjar", 0, vcarb02));
        piloti.add(new Pilota("Yuki Tsunoda", 0, vcarb02));

        // Williams
        Car fw47 = new Car("Williams", "FW47");
        vetture.add(fw47);
        piloti.add(new Pilota("Alexander Albon", 0, fw47));
        piloti.add(new Pilota("Carlos Sainz Jr.", 3, fw47));

        // Kick Sauber
        Car c45 = new Car("Kick Sauber", "C45");
        vetture.add(c45);
        piloti.add(new Pilota("Nico Hülkenberg", 0, c45));
        piloti.add(new Pilota("Gabriel Bortoleto", 0, c45));

        System.out.println("\n--- Lista piloti ---");
        for (Pilota current : piloti) {
            System.out.println(current);
            System.out.println("");
        }

        System.out.println("\n--- Lista Vetture ---");
        for (Car current : vetture)
            System.out.println(current);
        System.out.println("");

        Gara GPItalia = new Gara("Monza", piloti);

        System.out.println("\n -- GARA ---\n");

        System.out.println(GPItalia.getCircuito());
        GPItalia.partenza();

        pausa(4000);

        System.out.println("\n Il vincitore è : ....\n");
        pausa(400);

        System.out.println(GPItalia.getVincitore());
        System.out.println("\n \n");

        Gara GPBrasile = new Gara("Interlagos", piloti);

        pausa(1000);

        System.out.println("\n -- GARA ---\n");

        System.out.println(GPBrasile.getCircuito());
        GPBrasile.partenza();
        pausa(2000);
        System.out.println("\n Il vincitore è : ....\n");
        pausa(400);
        System.out.println(GPBrasile.getVincitore());
        System.out.println("\n \n");
    }

    // METODO STATICO PER INSERIRE UNA PAUSA

    public static void pausa(int millisecondi) {
        try {
            Thread.sleep(millisecondi);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
