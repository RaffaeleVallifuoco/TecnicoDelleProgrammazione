package it.raffo.springboot_example.MODEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class SchedaVideo {
    private String modello;
    private int memoria;

    public SchedaVideo(String modello, int memoria) {
        this.modello = modello;
        this.memoria = memoria;
    }

    @Autowired
    @Lazy
    private SchedaVideo() {

    }

    public SchedaVideo(String modello) {
        this.modello = modello;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "SchedaVideo [modello=" + modello + ", memoria=" + memoria + "]";
    }

    @PostConstruct
    public void inizializzazione() {
        System.out.println("Bean Scheda Video appena creato");
    }

}
