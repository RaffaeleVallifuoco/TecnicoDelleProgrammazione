package it.raffo.progetto_spring.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Autore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @OneToMany(mappedBy = "autore")
    private List<Libro> listaLibri;

    public Autore() {
    }

    public Autore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Autore(Integer id, String nome, String cognome) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
    }

    public Autore(String nome, String cognome, List<Libro> listaLibri) {
        this.nome = nome;
        this.cognome = cognome;
        this.listaLibri = listaLibri;
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

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Libro> getListaLibri() {
        return listaLibri;
    }

    public void setListaLibri(List<Libro> listaLibri) {
        this.listaLibri = listaLibri;
    }

    @Override
    public String toString() {
        return "Autore [id=" + id + ", nome=" + nome + ", cognome=" + cognome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
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
        Autore other = (Autore) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (cognome == null) {
            if (other.cognome != null)
                return false;
        } else if (!cognome.equals(other.cognome))
            return false;
        return true;
    }

}
