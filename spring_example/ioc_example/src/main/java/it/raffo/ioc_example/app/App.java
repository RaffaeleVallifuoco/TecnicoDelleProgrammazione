package it.raffo.ioc_example.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.raffo.ioc_example.bean.Connessione;
import it.raffo.ioc_example.bean.Utente;
import it.raffo.ioc_example.bean.UtentePlus;
import it.raffo.ioc_example.config.Config;

public class App {
    public static void main(String[] args) {

        // prima di Spring

        // Utente utente = new Utente();
        // utente.setNickname("Gianfraschio");

        // Connessione conn = new Connessione();

        // utente.setConnessione(conn);
        // System.out.println(utente.connettiti());

        // con Spring

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Utente utente = context.getBean(Utente.class);
        utente.setNickname("Ubaldo");
        System.err.println(utente.connettiti());

        // oppure
        System.out.println(context.getBean(Utente.class).connettiti());

        UtentePlus user = context.getBean(UtentePlus.class);
        user.setNickname("Filiberto");
        System.err.println(user.connettiti());

        context.close();
    }

}
