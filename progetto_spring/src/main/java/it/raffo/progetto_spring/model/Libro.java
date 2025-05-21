package it.raffo.progetto_spring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tiolo")
    private String titolo;

    @Column(name = "id_autore")
    private Integer idAutore;

    @ManyToOne
    @JoinColumn(name = "id_autore", insertable = false, updatable = false, nullable = true)
    private Autore autore;

    public Libro() {
    }

    public Libro(String titolo, Integer idAutore) {
        this.titolo = titolo;
        this.idAutore = idAutore;
    }

    public Libro(Integer id, String titolo, Integer idAutore) {
        this.id = id;
        this.titolo = titolo;
        this.idAutore = idAutore;
    }

    public Libro(Integer id, String titolo, Integer idAutore, Autore autore) {
        this.id = id;
        this.titolo = titolo;
        this.idAutore = idAutore;
        this.autore = autore;
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

    @Override
    public String toString() {
        return "Libro [id=" + id + ", titolo=" + titolo + ", idAutore=" + idAutore + "]";
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Integer getIdAutore() {
        return idAutore;
    }

    public void setIdAutore(Integer idAutore) {
        this.idAutore = idAutore;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
        result = prime * result + ((idAutore == null) ? 0 : idAutore.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (titolo == null) {
            if (other.titolo != null)
                return false;
        } else if (!titolo.equals(other.titolo))
            return false;
        if (idAutore == null) {
            if (other.idAutore != null)
                return false;
        } else if (!idAutore.equals(other.idAutore))
            return false;
        return true;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

}
