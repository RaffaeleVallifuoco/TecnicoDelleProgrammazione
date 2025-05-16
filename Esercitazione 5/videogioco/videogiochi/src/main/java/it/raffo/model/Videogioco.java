package it.raffo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Videogioco")
public class Videogioco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "cathegory", nullable = false)
    private String cathegory;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "pegi", nullable = false)
    private int pegi;

    // CONSTRUCTORS

    public Videogioco() {
    }

    public Videogioco(Integer id, String name, Double price, String cathegory, String description, int pegi) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cathegory = cathegory;
        this.description = description;
        this.pegi = pegi;
    }

    // GETTER & SETTER

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCathegory() {
        return cathegory;
    }

    public void setCathegory(String cathegory) {
        this.cathegory = cathegory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "Videogioco [id=" + id + ", name=" + name + ", price=" + price + ", cathegory=" + cathegory
                + ", description=" + description + ", pegi=" + pegi + "]";
    }

}
