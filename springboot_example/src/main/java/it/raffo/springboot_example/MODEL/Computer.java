package it.raffo.springboot_example.MODEL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {

    private String modello;
    private SchedaVideo schedaVideo;

    public Computer() {
    }

    @Autowired
    public Computer(String modello, SchedaVideo schedaVideo) {
        this.modello = modello;
        this.schedaVideo = schedaVideo;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public SchedaVideo getSchedaVideo() {
        return schedaVideo;
    }

    public void setSchedaVideo(SchedaVideo schedaVideo) {
        this.schedaVideo = schedaVideo;
    }

    @Override
    public String toString() {
        return "Computer [modello=" + modello + ", schedaVideo=" + schedaVideo + "]";
    }

}
