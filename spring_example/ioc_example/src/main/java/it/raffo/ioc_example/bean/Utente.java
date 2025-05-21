package it.raffo.ioc_example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

public class Utente {
    private String nickname;

    // defubusce dive Soring cintainer deve eseguire
    // la deoendency injection
    @Autowired
    @Qualifier("base")
    private Connessione connessione;

    // CONSTRUCTOR

    public Utente() {

    }

    public Utente(String nickname, Connessione connessione) {
        this.nickname = nickname;
        this.connessione = connessione;
    }

    // GETTER & SETTER

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Connessione getConnessione() {
        return connessione;
    }

    @Lazy
    @Resource(name = "base")
    public void setConnessione(Connessione connessione) {
        this.connessione = connessione;
    }

    // NMETHODS

    public String connettiti() {
        return "\n" + this.nickname + " : " + connessione.login() + "\n";
    }

    @PostConstruct
    public void metodoPostConstruct() {
        System.out.println("\nBean utente appena creato\n");
    }

    @PreDestroy
    public void metodoOreDestroy() {
        System.out.println("\nBean utente sta per essere distrutto\n");
        this.connessione = null;
        System.out.println("\nLa connessione è stata interrotta . Connessione : " + this.connessione);
    }

}
