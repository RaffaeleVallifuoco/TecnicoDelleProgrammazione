package it.raffo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Studente")
public class Studente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @OneToOne
    @JoinColumn(name = "serial_id", referencedColumnName = "id")
    private Matricola serial;

    @ManyToMany
    @JoinTable(name = "studente_corso", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Corso> courses;

    public Studente() {

    }

    public Studente(Integer id, String name, String lastName, Matricola serial, List<Corso> courses) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.serial = serial;
        this.courses = courses;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Matricola getSerial() {
        return serial;
    }

    public void setSerial(Matricola serial) {
        this.serial = serial;
    }

    public List<Corso> getCourses() {
        return courses;
    }

    public void setCourses(List<Corso> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Studente [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
    }

}
