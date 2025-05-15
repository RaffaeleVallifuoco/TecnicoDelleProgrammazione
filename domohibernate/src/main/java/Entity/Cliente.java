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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nome;

    @Column
    private String cognome;

    @Column
    private String email;

    @Column
    @OneToOne
    @JoinColumn(name = "id_codice_fiscale")
    private CodiceFiscale cf;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "prenotazione", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "id_cliente", referencedColumnName = "id"))
    List<Libro> listaLibri;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cognome, String email, CodiceFiscale cf) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.cf = cf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CodiceFiscale getCf() {
        return cf;
    }

    public void setCf(CodiceFiscale cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", cf=" + cf
                + "]";
    }

}
