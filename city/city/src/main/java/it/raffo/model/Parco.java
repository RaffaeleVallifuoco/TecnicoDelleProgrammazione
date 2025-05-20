package it.raffo.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "Parco")
@SecondaryTable(name = "Attrazioni", pkJoinColumns = @PrimaryKeyJoinColumn(name = "codice"))
public class Parco {

    @Id
    @Column(name = "codice")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "ettari")
    private double ettari;

    @Column(name = "numero:alberi")
    private int numeroAlberi;

    @Column(name = "lago", table = "Attrazioni")
    private boolean lago;

    @Column(name = "velodromo", table = "Attrazioni")
    private boolean velodromo;

    @Column(name = "parco_giochi", table = "Attrazioni")
    private boolean parcoGiochi;

    @Column(name = "campo_bocce", table = "Attrazioni")
    private boolean campoDiBocce;

    @Column(name = "campo_golf", table = "Attrazioni")
    private boolean campoDIGolf;

    @Column(name = "giardino_botanico", table = "Attrazioni")
    private boolean giardinoBotanico;

    @Column(name = "zoo", table = "Attrazioni")
    private boolean zoo;

    @ManyToOne
    @JoinColumn(name = "id_citta", referencedColumnName = "codice")
    private City citta;

    public Parco() {
    }

    public Parco(String nome, double ettari, int numeroAlberi, boolean lago, boolean velodromo, boolean parcoGiochi,
            boolean campoDiBocce, boolean campoDIGolf, boolean giardinoBotanico, boolean zoo, City citta) {
        this.nome = nome;
        this.ettari = ettari;
        this.numeroAlberi = numeroAlberi;
        this.lago = lago;
        this.velodromo = velodromo;
        this.parcoGiochi = parcoGiochi;
        this.campoDiBocce = campoDiBocce;
        this.campoDIGolf = campoDIGolf;
        this.giardinoBotanico = giardinoBotanico;
        this.zoo = zoo;
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Parco [id=" + id + ", nome=" + nome + ", ettari=" + ettari + ", numeroAlberi=" + numeroAlberi
                + ", lago=" + lago + ", velodromo=" + velodromo + ", parcoGiochi=" + parcoGiochi + ", campoDiBocce="
                + campoDiBocce + ", campoDIGolf=" + campoDIGolf + ", giardinoBotanico=" + giardinoBotanico + ", zoo="
                + zoo + ", citta=" + citta + "]";
    }

}
