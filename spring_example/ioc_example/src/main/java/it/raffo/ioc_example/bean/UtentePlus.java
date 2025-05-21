package it.raffo.ioc_example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;

public class UtentePlus {
    private String nickname;

    // @Resource(name = "rapida")
    @Qualifier("rapida")
    @Autowired
    private Connessione connessione;

    // CONSTRUCTORS

    public UtentePlus() {

    }

    public UtentePlus(String nickname, Connessione connessione) {
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

    public void setConnessione(Connessione connessione) {
        this.connessione = connessione;
    }

    // METHODS

    public String connettiti() {
        return "\n" + this.nickname + " : " + connessione.login() + " fast\n";
    }

    @PostConstruct
    public void metodoPostConstruct() {
        System.out.println("\nBean utentePlus appena creato\n");
    }

    @PreDestroy
    public void metodoOreDestroy() {
        System.out.println("\nBean utentePlus sta per essere distrutto\n");
    }

}
