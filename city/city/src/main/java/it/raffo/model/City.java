package it.raffo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Citta")
public class City {
    @Id
    @Column(name = "codice")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "stato")
    private String stato;

    @Column(name = "numero_abitanti")
    private Integer numeroAbitanti;

    // CONSTRUCTORS

    public City() {
    }

    public City(String nome, String stato, Integer numeroAbitanti) {
        this.nome = nome;
        this.stato = stato;
        this.numeroAbitanti = numeroAbitanti;
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

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public Integer getNumeroAbitanti() {
        return numeroAbitanti;
    }

    public void setNumeroAbitanti(Integer numeroAbitanti) {
        this.numeroAbitanti = numeroAbitanti;
    }

    @Override
    public String toString() {
        return "City [id=" + id + ", nome=" + nome + ", stato=" + stato + ", numeroAbitanti=" + numeroAbitanti + "]";
    }

}
