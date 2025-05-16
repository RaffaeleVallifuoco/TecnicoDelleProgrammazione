package it.raffo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Personaggio")
public class Personaggio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "equipment", nullable = true)
    private String equipment;

    @Column(name = "faction", nullable = true)
    private String faction;

    @Column(name = "race", nullable = true)
    private String race;

    // CONSTRUCTORS

    public Personaggio() {
    }

    public Personaggio(Integer id, String name, int age, String equipment, String faction, String race) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.equipment = equipment;
        this.faction = faction;
        this.race = race;
    }

    // GETTER & SETTER)

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @ManyToOne
    @JoinColumn(name = "id_videogames")
    private Videogioco videogioco;

    // TOSTRING

    @Override
    public String toString() {
        return "Personaggio [id=" + id + ", name=" + name + ", age=" + age + ", equipment=" + equipment + ", faction="
                + faction + ", race=" + race + "]";
    }

}
