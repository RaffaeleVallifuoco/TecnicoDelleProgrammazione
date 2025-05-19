package it.raffo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ordine")
public class Ordine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "prezzo", nullable = false)
    private Double prezzo;

    @Column(name = "numero_articoli")
    private int numeroArticoli;

    @Column(name = "data_richiesta")
    private LocalDate dataRichiesta;

    @ManyToOne
    @JoinColumn(name = "id_utente")
    private Utente utente;

    // CONSTRUCTORS

    public Ordine() {
    }

    public Ordine(Double prezzo, int numeroArticoli, LocalDate dataRichiesta, Utente utente) {
        this.prezzo = prezzo;
        this.numeroArticoli = numeroArticoli;
        this.dataRichiesta = dataRichiesta;
        this.utente = utente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(Double prezzo) {
        this.prezzo = prezzo;
    }

    public int getNumeroArticoli() {
        return numeroArticoli;
    }

    public void setNumeroArticoli(int numeroArticoli) {
        this.numeroArticoli = numeroArticoli;
    }

    public LocalDate getDataRichiesta() {
        return dataRichiesta;
    }

    public void setDataRichiesta(LocalDate dataRichiesta) {
        this.dataRichiesta = dataRichiesta;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    @Override
    public String toString() {
        return "Ordine [id=" + id + ", prezzo=" + prezzo + ", numeroArticoli=" + numeroArticoli + ", dataRichiesta="
                + dataRichiesta + "]";
    }
}