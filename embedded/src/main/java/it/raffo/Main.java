package it.raffo;

import java.util.ArrayList;
import java.util.List;

import it.raffo.dao.DaoInterface;
import it.raffo.model.Utente;
import it.raffo.model.Ordine;
import it.raffo.model.Residenza;
import it.raffo.dao.UtenteDaoImpl;
import it.raffo.dao.OrdiniDaoImpl;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Residenza residenza1 = new Residenza();
        residenza1.setIndirizzo("Via Roma 10");
        residenza1.setCap("00100");
        residenza1.setCitta("Roma");

        Residenza residenza2 = new Residenza();
        residenza2.setIndirizzo("Via Milano 20");
        residenza2.setCap("20100");
        residenza2.setCitta("Milano");

        DaoInterface<Utente> utentiDao = new UtenteDaoImpl();
        DaoInterface<Ordine> ordiniDao = new OrdiniDaoImpl();

        List<Ordine> ordiniList = new ArrayList<>();
        Ordine o1 = new Ordine(99.99, 3, null, null);
        Ordine o2 = new Ordine(10.00, 3, null, null);
        ; // ordiniList.add(new Ordine(99.99, 2, LocalDate.now(), null));
          // ordiniList.add(new Ordine(149.49, 1, LocalDate.now(), null));

        List<Utente> utentiList = new ArrayList<>();
        Utente u1 = new Utente("Marco", "MRCLSS90A01H501K", "3331234567", residenza1);
        Utente u2 = new Utente("Anna", "ANNRZZ85B41F205L", "3397654321", residenza2);

        u1.getListaOrdini().add(o1);
        o1.setUtente(u1);
        u2.getListaOrdini().add(o2);
        o2.setUtente(u2);

        utentiList.add(u1);
        utentiList.add(u2);

        System.out.println("\nSTAMPA UTENTI\n");
        System.out.println(utentiDao.findAll());

        // ordiniDao.insertMany(ordiniList);

        System.out.println("\nSTAMPA ORDINI\n");

        utentiDao.insertMany(utentiList);
        System.out.println(ordiniDao.findAll());

    }

}
