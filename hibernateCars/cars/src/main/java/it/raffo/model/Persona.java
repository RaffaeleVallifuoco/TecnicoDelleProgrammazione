package it.raffo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "òast_name", nullable = false)
    private String lastName;

    @Column(name = "address", nullable = false)
    private String Address;

    @Column(name = "job", nullable = false)
    private String job;

    @Column(name = "age", nullable = false)
    private int age;

    @OneToOne(mappedBy = "owner")
    private Auto auto;

    public Persona() {
    }

    public Persona(String name, String lastName, String address, String job, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        Address = address;
        this.job = job;
        this.age = age;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", name=" + name + ", lastName=" + lastName + ", Address=" + Address + ", job="
                + job + ", age=" + age + ", auto=" + auto + "]";
    }

}
