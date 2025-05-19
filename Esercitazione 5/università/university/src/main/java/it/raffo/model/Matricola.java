package it.raffo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Matricola")

public class Matricola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "serial", nullable = false, unique = true)
    private String serial;

    public Matricola() {

    }

    public Matricola(Integer id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Matricola [id=" + id + ", serial=" + serial + "]";
    }

}
