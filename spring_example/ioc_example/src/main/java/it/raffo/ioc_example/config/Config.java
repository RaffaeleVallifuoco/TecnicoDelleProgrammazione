package it.raffo.ioc_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;

import it.raffo.ioc_example.bean.Connessione;
import it.raffo.ioc_example.bean.Utente;
import it.raffo.ioc_example.bean.UtentePlus;

@Configuration
@Import(ConnectionConfig.class)
public class Config {

    // Spring lo invoa per ottenere istanze di oggetti che saranno registrati come
    // bean
    // di spring
    @Lazy
    @Bean
    public Utente utente() {
        return new Utente();
    }

    @Bean
    public UtentePlus utentePlus() {
        return new UtentePlus();
    }

    // gestisco questo bean in connectionconfig

    // @Bean
    // public Connessione connessione() {
    // return new Connessione();
    // }

}
