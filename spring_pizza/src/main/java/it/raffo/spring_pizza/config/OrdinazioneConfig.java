package it.raffo.spring_pizza.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import it.raffo.spring_pizza.model.Ordinazione;
import it.raffo.spring_pizza.model.PizzaBianca;
import it.raffo.spring_pizza.model.PizzaRossa;

@Configuration
public class OrdinazioneConfig {

    @Lazy
    @Bean
    public PizzaBianca getPizzaBianca() {
        return new PizzaBianca("Pizza bianca");
    }

    @Bean(name = "pizzaBianca")
    public Ordinazione ordinazione() {
        return new Ordinazione();
    }

    @Bean(name = "pizzaRossa")
    public Ordinazione ordinazioneRossa() {
        return new Ordinazione();
    }

    @Bean
    public PizzaRossa getPizzaRossa() {
        return new PizzaRossa("Pizza rossa");
    }
}