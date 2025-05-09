package corse;

public class Car {

    private String scuderia;
    private String modello;

    // CONSTRUCTORS

    public Car() {

    };

    public Car(String scuderia, String modello) {
        this.scuderia = scuderia;
        this.modello = modello;
    }

    // GETTER & SETTER

    public String getScuderia() {
        return scuderia;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    // METHODS

    @Override
    public String toString() {
        return "Scuderia: " + scuderia + ", Modello: " + modello;
    }

}
