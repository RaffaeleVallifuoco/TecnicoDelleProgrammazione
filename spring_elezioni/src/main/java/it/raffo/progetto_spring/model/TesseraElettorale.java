package it.raffo.progetto_spring.model;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tessera_elettorale")
public class TesseraElettorale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @OneToOne
    @JoinColumn(name = "persona_id", referencedColumnName = "id", nullable = false, unique = true)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "seggio_id", nullable = false)
    private Seggio seggio;

    // CONSTRUCTORS

    public TesseraElettorale() {
    }

    public TesseraElettorale(String code, Persona persona, Seggio seggio) {
        this.code = code;
        this.persona = persona;
        this.seggio = seggio;
    }

    // GETTERS & SETTERS

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Seggio getSeggio() {
        return seggio;
    }

    public void setSeggio(Seggio seggio) {
        this.seggio = seggio;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "TesseraElettorale [id=" + id + ", code=" + code + ", persona=" + persona + ", seggio=" + seggio + "]";
    }

}
