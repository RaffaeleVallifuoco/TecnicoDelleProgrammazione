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
                    log.info("Precaricamento "
                            + personaRepo.save(new Persona("Luca", "Rossi", "LCRRSS85M01F205X")));
                    log.info("Precaricamento "
                            + personaRepo.save(new Persona("Giulia", "Verdi", "GLVVRD90A41H501B")));
                    log.info("Precaricamento "
                            + personaRepo.save(new Persona("Marco", "Neri", "MRCNRI70T15D612C")));
                    log.info("Precaricamento "
                            + personaRepo.save(new Persona("Elisa", "Gallo", "LSAGLL95C58F205Z")));
                    log.info("Precaricamento "
                            + personaRepo.save(new Persona("Francesca", "Bianchi", "FRCBNC88L47A662E")));
                }

                if (seggioRepo.count() == 0) {
                    log.info("Precaricamento "
                            + seggioRepo.save(new Seggio(7456, "Via privata", "Casoria", "Napoli", "Campania")));
                    log.info("Precaricamento "
                            + seggioRepo
                                    .save(new Seggio(7457, "Via delle Rose", "Bologna", "Bologna", "Emilia-Romagna")));
                    log.info("Precaricamento "
                            + seggioRepo
                                    .save(new Seggio(7458, "Piazza Garibaldi", "Parma", "Parma", "Emilia-Romagna")));
                    log.info("Precaricamento "
                            + seggioRepo.save(new Seggio(7459, "Via Roma", "Milano", "Milano", "Lombardia")));
                    log.info("Precaricamento "
                            + seggioRepo.save(new Seggio(7460, "Viale Europa", "Torino", "Torino", "Piemonte")));
                    log.info("Precaricamento "
                            + seggioRepo.save(new Seggio(7461, "Corso Italia", "Firenze", "Firenze", "Toscana")));
                }

                if (tesseraRepo.count() == 0) {
                    log.info("Precaricamento "
                            + tesseraRepo.save(new TesseraElettorale("AA1122BB", 1, 1)));
                    log.info("Precaricamento "
                            + tesseraRepo.save(new TesseraElettorale("BB2233CC", 2, 2)));
                    log.info("Precaricamento "
                            + tesseraRepo.save(new TesseraElettorale("CC3344DD", 3, 3)));
                    log.info("Precaricamento "
                            + tesseraRepo.save(new TesseraElettorale("DD4455EE", 4, 4)));
                    log.info("Precaricamento "
                            + tesseraRepo.save(new TesseraElettorale("EE5566FF", 5, 5)));
                    log.info("Precaricamento "
                            + tesseraRepo.save(new TesseraElettorale("FF6677GG", 6, 6)));
                }

            } catch (Exception e) {
                log.error("Errore nel precaricamento del database", e);
            }
        };
    }

}
