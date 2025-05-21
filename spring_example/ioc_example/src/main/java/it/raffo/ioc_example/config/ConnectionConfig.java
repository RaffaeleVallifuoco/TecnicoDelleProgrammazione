package it.raffo.ioc_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import it.raffo.ioc_example.bean.Connessione;

@Configuration
public class ConnectionConfig {

    @Lazy
    @Bean(name = "base")
    public Connessione getConnection() {
        return new Connessione();
    }

    @Bean(name = "rapida")
    public Connessione getFastConnection() {
        return new Connessione("ultra fast");
    }

}
