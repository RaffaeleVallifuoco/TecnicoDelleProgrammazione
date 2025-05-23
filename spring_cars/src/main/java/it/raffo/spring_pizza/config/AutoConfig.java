package it.raffo.spring_pizza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import it.raffo.spring_pizza.model.Automobile;
import it.raffo.spring_pizza.model.TipoMotore;

@Configuration
public class AutoConfig {

    @Bean
    public Automobile getAutoBenzina() {
        return new Automobile(TipoMotore.BENZINA);
    }

    @Bean
    public Automobile getAutoDiesel() {
        return new Automobile(TipoMotore.DIESEL);
    }

    @Bean
    public Automobile getAutoElettrica() {
        return new Automobile(TipoMotore.ELETTRICO);
    }

}