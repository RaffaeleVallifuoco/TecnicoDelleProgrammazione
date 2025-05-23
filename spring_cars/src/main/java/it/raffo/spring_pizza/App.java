package it.raffo.spring_pizza;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.raffo.spring_pizza.config.AutoConfig;
import it.raffo.spring_pizza.model.Automobile;

public class App {
    public static void main(String[] args) {

        System.out.println("\n Spring Cars : \n");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);

        Automobile autoBenzina = context.getBean("getAutoBenzina", Automobile.class);
        autoBenzina.setModello("Fiat Punto");
        System.out.println(autoBenzina);

        System.out.println("\n----------------------------\n");

        Automobile autoDiesel = context.getBean("getAutoDiesel", Automobile.class);
        autoDiesel.setModello("Renault Clio");
        System.out.println(autoDiesel);

        System.out.println("\n----------------------------\n");

        Automobile autoElettrica = context.getBean("getAutoElettrica", Automobile.class);
        autoElettrica.setModello("Tesla Model A");
        System.out.println(autoElettrica);

        System.out.println("\n----------------------------\n");
    }
}
