package Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Libro {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String descrizione;

    @Column
    private String titolo;

    @ManyToOne
    @JoinColumn(name = "id_autore")
    private Autore autore;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prenotazione", joinColumns = @JoinColumn(name = "id_libro"), inverseJoinColumns = @JoinColumn(name = "id_cliente", referencedColumnName = "id"))
    List<Cliente> listaClienti;

    public Libro() {
    }

    public Libro(Integer id, String descrizione, String titolo) {
        this.id = id;
        this.descrizione = descrizione;
        this.titolo = titolo;
    }

    public Libro(Integer id, String descrizione, String titolo, Autore autore) {
        this.id = id;
        this.descrizione = descrizione;
        this.titolo = titolo;
        this.autore = autore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libro [id=" + id + ", descrizione=" + descrizione + ", titolo=" + titolo + "]";
    }
}
