package it.raffo.progetto_spring.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fumetteria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "indirizzo")
    private String indirizzo;

    @OneToMany(mappedBy = "fumetteria")
    private List<Manga> listaManga;

    public Fumetteria() {
    }

    public Fumetteria(String nome, String indirizzo, List<Manga> listaManga) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.listaManga = listaManga;
    }

    public Fumetteria(String nome, String indirizzo) {
        this.nome = nome;
        this.indirizzo = indirizzo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public List<Manga> getListaManga() {
        return listaManga;
    }

    public void setListaManga(List<Manga> listaManga) {
        this.listaManga = listaManga;
    }

    @Override
    public String toString() {
        return "Fumetteria [id=" + id + ", nome=" + nome + ", indirizzo=" + indirizzo + ", listaManga=" + listaManga
                + "]";
    }

}
