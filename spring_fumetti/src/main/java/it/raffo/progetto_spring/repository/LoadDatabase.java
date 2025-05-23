package it.raffo.progetto_spring.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.raffo.progetto_spring.model.Fumetteria;
import it.raffo.progetto_spring.model.Manga;

@Configuration
public class LoadDatabase {

    // creo un logger che tiene traccia di cio che stiamo facendo

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    // inserimento dati a dbs
    @Bean
    CommandLineRunner initDatabase(MangaRepo mangaRepo, FumetteriaRepo autoreRepo) {
        return args -> {
            try {
                log.info("Precaricamento" + autoreRepo.save(new Fumetteria("fumetteria1", "indirizzo1")));
                log.info("Precaricamento" + autoreRepo.save(new Fumetteria("fumetteria2", "indirizzo2")));
                log.info("Precaricamento" + autoreRepo.save(new Fumetteria("fumetteria3", "indirizzo3")));
                log.info("Precaricamento" + autoreRepo.save(new Fumetteria("fumetteria4", "indirizzo4")));

                log.info("Precaricamento" + mangaRepo.save(new Manga("Manga1", 1)));
                log.info("Precaricamento" + mangaRepo.save(new Manga("Manga2", 2)));
                log.info("Precaricamento" + mangaRepo.save(new Manga("Manga3", 3)));
                log.info("Precaricamento" + mangaRepo.save(new Manga("Manga5", 4)));
                log.info("Precaricamento" + mangaRepo.save(new Manga("Manga6", 4)));
                log.info("Precaricamento" + mangaRepo.save(new Manga("Manga7", 4)));

            } catch (Exception e) {
                log.error("Something goes wrong !");
                e.printStackTrace();
            }
        };
    }

}
