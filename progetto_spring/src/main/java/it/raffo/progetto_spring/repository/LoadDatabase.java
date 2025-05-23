package it.raffo.progetto_spring.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.raffo.progetto_spring.model.Autore;
import it.raffo.progetto_spring.model.Libro;

@Configuration
public class LoadDatabase {

    // creo un logger che tiene traccia di cio che stiamo facendo

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    // inserimento dati a db
    // @Bean
    // CommandLineRunner initDatabase(LibroRepo libroRepo, AutoreRepo autoreRepo) {
    // return args -> {
    // try {
    // log.info("Precaricamento" + autoreRepo.save(new Autore("J.R.R", "Folkien")));
    // log.info("Precaricamento" + autoreRepo.save(new Autore("Ernest",
    // "Hemingway")));
    // log.info("Precaricamento" + autoreRepo.save(new Autore("Mario", "Marione")));
    // log.info("Precaricamento" + autoreRepo.save(new Autore("Autore4",
    // "Cognome4")));

    // log.info("Precaricamento" + libroRepo.save(new Libro("Il signore degli
    // anelli", 1)));
    // log.info("Precaricamento" + libroRepo.save(new Libro("Il vecchio e il mare",
    // 2)));

    // } catch (Exception e) {
    // log.error("Something goes wrong !");
    // e.printStackTrace();
    // }
    // };
    // }

    @Bean
    CommandLineRunner initDatabase(LibroRepo libroRepo, AutoreRepo autoreRepo) {
        return args -> {
            try {
                if (autoreRepo.count() == 0) {
                    log.info("Precaricamento " + autoreRepo.save(new Autore("J.R.R", "Folkien")));
                    log.info("Precaricamento " + autoreRepo.save(new Autore("Ernest", "Hemingway")));
                    log.info("Precaricamento " + autoreRepo.save(new Autore("Mario", "Marione")));
                    log.info("Precaricamento " + autoreRepo.save(new Autore("Autore4", "Cognome4")));
                }

                if (libroRepo.count() == 0) {
                    log.info("Precaricamento " + libroRepo.save(new Libro("Il signore degli anelli", 1)));
                    log.info("Precaricamento " + libroRepo.save(new Libro("Il vecchio e il mare", 2)));
                }

            } catch (Exception e) {
                log.error("Errore nel precaricamento del database", e);
            }
        };
    }

}
