package App;

import java.util.ArrayList;
import java.util.List;

import Entity.Autore;
import dao.InterfacciaDao;
import dao.autoreDaoImpl;

public class App {

    public static void main(String[] args) {

        System.out.println("\nSTAMPA AUTORI\n");
        InterfacciaDao<Autore> autoreDao = new autoreDaoImpl();

        System.out.println(autoreDao.findAll());

        System.out.println("\nSTAMPA AUTORE SINGOLO\n");
        int autore = 3;
        Autore autore2 = autoreDao.findbyId(autore);
        System.out.println(autore2);

        System.out.println("\nINSERISCI AUTORI\n");
        List<Autore> listaAutori = new ArrayList<Autore>();
        listaAutori.add(new Autore(6, "Autore1", "Autore1"));
        listaAutori.add(new Autore(7, "Autore2", "Autore2"));
        listaAutori.add(new Autore(8, "Autore3", "Autore3"));
        autoreDao.insertMany(listaAutori);

    }

}
