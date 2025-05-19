package it.raffo;

import it.raffo.dao.CorsoDaoImpl;
import it.raffo.dao.StudenteDaoImpl;
import it.raffo.dao.DaoInterface;
import it.raffo.model.Studente;
import it.raffo.model.Corso;
import it.raffo.model.Matricola;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DaoInterface<Studente> studenteDao = new StudenteDaoImpl();
        DaoInterface<Corso> corsoDao = new CorsoDaoImpl();

        List<Studente> studenti = new ArrayList<>();
        List<Corso> corsi = new ArrayList<>();

        // Inserimento corsi
        corsi.add(new Corso(null, "Informatica", "Aula 101"));
        corsi.add(new Corso(null, "Matematica", "Aula 102"));
        corsi.add(new Corso(null, "Fisica", "Aula 103"));
        corsi.add(new Corso(null, "Chimica", "Aula 104"));
        corsi.add(new Corso(null, "Statistica", "Aula 105"));

        // corsoDao.insertMany(corsi);
        System.out.println("CORSI INSERITI:");
        System.out.println(corsoDao.findAll());

        Corso c = corsoDao.findbyId(3);

        // Inserimento studenti

        Studente s = new Studente(null, "Marco", "Rossi", new Matricola(null, "A001"), null);
        s.getCourses().add(c); // ✅ funziona se hai getCorsi() e la lista non è null

        studenti.add(s);
        // studenti.add(new Studente(null, "Luca", "Bianchi", new Matricola(null,
        // "A002"), corsi));
        // studenti.add(new Studente(null, "Anna", "Verdi", new Matricola(null, "A003"),
        // corsi));
        // studenti.add(new Studente(null, "Giulia", "Neri", new Matricola(null,
        // "A004"), corsi));
        // studenti.add(new Studente(null, "Paolo", "Gialli", new Matricola(null,
        // "A005"), corsi));

        studenteDao.insertMany(studenti);
        System.out.println("STUDENTI INSERITI:");
        System.out.println(studenteDao.findAll());
    }
}