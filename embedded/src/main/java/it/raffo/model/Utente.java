package it.raffo.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codicef_fiscale", unique = true)
    private String codiceFiscale;

    @Column(name = "telefono", unique = true)
    private String telefono;

    @Embedded
    private Residenza residenza;

    @OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
    private List<Ordine> listaOrdini;

    // CONSTRUCTORS

    public Utente() {
        this.listaOrdini = new ArrayList<>();
    }

    public Utente(String nome, String codiceFiscale, String telefono, Residenza residenza) {
        this.nome = nome;
        this.codiceFiscale = codiceFiscale;
        this.telefono = telefono;
        this.residenza = residenza;
        this.listaOrdini = new ArrayList<>();
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

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Residenza getResidenza() {
        return residenza;
    }

    public void setResidenza(Residenza residenza) {
        this.residenza = residenza;
    }

    public List<Ordine> getListaOrdini() {
        return listaOrdini;
    }

    public void setListaOrdini(List<Ordine> listaOrdini) {
        this.listaOrdini = listaOrdini;
    }

    @Override
    public String toString() {
        return "Utente [id=" + id + ", nome=" + nome + ", codiceFiscale=" + codiceFiscale +
                ", telefono=" + telefono + ", residenza=" + residenza + "]";
    }

}
