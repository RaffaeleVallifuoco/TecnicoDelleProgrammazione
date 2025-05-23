package it.raffo.progetto_spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "codice_fiscale", nullable = false, unique = true)
    private String codiceFiscale;

    // CONSTRUCTORS

    public Persona() {
    }

    public Persona(String name, String codiceFiscale) {
        this.name = name;
        this.codiceFiscale = codiceFiscale;
    }

    // GETTERS & SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Persona [id=" + id + ", name=" + name + ", codiceFiscale=" + codiceFiscale + "]";
    }

}
