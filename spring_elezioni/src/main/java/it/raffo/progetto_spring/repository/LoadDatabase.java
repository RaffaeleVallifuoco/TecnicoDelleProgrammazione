package it.raffo.progetto_spring.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.raffo.progetto_spring.model.Persona;
import it.raffo.progetto_spring.model.Seggio;
import it.raffo.progetto_spring.model.TesseraElettorale;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(PersonaRepo personaRepo, SeggioRepo seggioRepo, TesseraRepo tesseraRepo) {
        return args -> {
            try {
                if (personaRepo.count() == 0) {
                    log.info("Precaricamento "
                            + personaRepo.save(new Persona("Andrea   ", "Bianchi", "NDRBNC78N59L098Y))")));
                }

                log.info("Precaricamento "
                        + tesseraRepo.save(new TesseraElettorale("AA1122BB", 1, 1)));

                if (seggioRepo.count() == 0) {
                    log.info("Precaricamento "
                            + seggioRepo.save(new Seggio(7456, "Via privata", "Casoria", "Napoli", "Campania")));
                }

            } catch (Exception e) {
                log.error("Errore nel precaricamento del database", e);
            }
        };
    }

}
