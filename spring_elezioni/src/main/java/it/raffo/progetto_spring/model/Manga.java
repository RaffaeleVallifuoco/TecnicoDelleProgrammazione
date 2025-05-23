package it.raffo.progetto_spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Manga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tiolo")
    private String titolo;

    @Column(name = "id_fumetteria")
    private Integer idFumetteria;

    @ManyToOne
    @JoinColumn(name = "id_fumetteria", insertable = false, updatable = false, nullable = true)
    private Fumetteria fumetteria;

    public Manga() {
    }

    public Manga(String titolo, Integer idFumetteria) {
        this.titolo = titolo;
        this.idFumetteria = idFumetteria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getIdFumetteria() {
        return idFumetteria;
    }

    public void setIdFumetteria(Integer idFumetteria) {
        this.idFumetteria = idFumetteria;
    }

    public Fumetteria getFumetteria() {
        return fumetteria;
    }

    public void setFumetteria(Fumetteria fumetteria) {
        this.fumetteria = fumetteria;
    }

    @Override
    public String toString() {
        return "Manga [id=" + id + ", titolo=" + titolo + ", idFumetteria=" + idFumetteria + ", fumetteria="
                + fumetteria + "]";
    }

}
