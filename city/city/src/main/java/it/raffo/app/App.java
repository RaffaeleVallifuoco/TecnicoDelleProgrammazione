package it.raffo.app;

import java.util.ArrayList;
import java.util.List;

import it.raffo.dao.CityDaoImpl;
import it.raffo.dao.DaoInterface;
import it.raffo.dao.ParcoDaoImpl;
import it.raffo.model.City;
import it.raffo.model.Parco;

public class App {
    public static void main(String[] args) {

        DaoInterface<City> cityDao = new CityDaoImpl();
        DaoInterface<Parco> parcoDao = new ParcoDaoImpl();

        List<City> cities = new ArrayList<>();
        List<Parco> parchi = new ArrayList<>();

        Parco parco1 = new Parco("Parco1", 100, 2000, true, false, false, false, false, false, false);
        Parco parco2 = new Parco("Parco2", 2000, 100, false, false, false, false, true, true, true);

        City citta1 = new City("Casoria", "Italia", 1000);
        City citta2 = new City("Napoli", "Italia", 10000);

        cities.add(citta2);
        cities.add(citta1);

        parco1.setCitta(citta1);
        parco2.setCitta(citta2);

        citta1.getParchi().add(parco1);
        citta2.getParchi().add(parco2);

        parchi.add(parco1);
        parchi.add(parco2);

        cityDao.insert(citta1);
        cityDao.insert(citta2);

        System.out.println(cityDao.findAll());

        // parcoDao.insert(parco1);
        // parcoDao.insert(parco2);

        System.out.println(parcoDao.findAll());

        parcoDao.update(1, "parcomodificato");
        System.out.println(parcoDao.findAll());
        System.out.println("\nrimuovi\n");

        cityDao.remove(1);
        System.err.println("\nparchi\n");
        parcoDao.update(1, "parcomodificato");
        System.err.println("\ncitta\n");
        System.out.println(cityDao.findAll());

    }

}
