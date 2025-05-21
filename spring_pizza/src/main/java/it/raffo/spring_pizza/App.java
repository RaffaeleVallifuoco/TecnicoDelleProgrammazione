package it.raffo.spring_pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.raffo.spring_pizza.config.OrdinazioneConfig;
import it.raffo.spring_pizza.model.PizzaBianca;
import it.raffo.spring_pizza.model.PizzaRossa;

public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(OrdinazioneConfig.class);

        PizzaBianca pizzaBianca = context.getBean(PizzaBianca.class);
        pizzaBianca.setNome("bianca");
        System.out.println(pizzaBianca.ordina());
        PizzaRossa pizzaRossa = context.getBean(PizzaRossa.class);
        pizzaRossa.setNome("rossa");
        System.out.println(pizzaRossa.ordina());

    }
}
