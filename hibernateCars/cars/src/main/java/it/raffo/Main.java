package it.raffo;

import java.util.ArrayList;
import java.util.List;

import it.raffo.dao.InterfacciaDao;
import it.raffo.model.Auto;
import it.raffo.dao.AutoDaoImpl;
import it.raffo.model.Persona;
import it.raffo.dao.PersonaDaoImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        InterfacciaDao<Auto> cars = new AutoDaoImpl();

        System.out.println("\nINSERISCI AUTO\n");
        List<Auto> carList = new ArrayList<Auto>();
        carList.add(new Auto("Renault Clio", "AA11BB", "123AA123", "2WD"));
        carList.add(new Auto("Nissan Qashqai", "CC22DD", "174UI45", "2WD"));
        carList.add(new Auto("Lancia Delta Integrale", "EE33FF", "878753A", "4WD"));
        carList.add(new Auto("Fiat Panda", "GG55HH", "9983AA123", "2WD"));
        carList.add(new Auto("Opel Meriva", "II66LL", "G0998HJ3", "2WD"));

        // cars.insertMany(carList);

        System.out.println("\nSTAMPA AUTO\n");
        System.out.println(cars.findAll());

        System.out.println("\nINSERISCI PERSONE\n");
        InterfacciaDao<Persona> persone = new PersonaDaoImpl();
        List<Persona> personaList = new ArrayList<Persona>();
        personaList.add(new Persona("Mario", "Rossi", "MRARSS80A01F205X", " programmatore", 24));
        personaList.add(new Persona("Luisa", "Verdi", "LSAVRD85C41H501U", "impiegatto", 29));
        personaList.add(new Persona("Giovanni", "Bianchi", "GVNBNC90D12Z404T", "medico", 36));
        personaList.add(new Persona("Anna", "Neri", "ANNNRI95M50L219J", "farmacista", 30));
        personaList.add(new Persona("Francesco", "Russo", "FRCRSS78L01H703Q", "sviluppatore", 31));
        persone.insertMany(personaList);

        System.out.println("\nSTAMPA PERSONE\n");
        System.out.println(persone.findAll());
    }
}