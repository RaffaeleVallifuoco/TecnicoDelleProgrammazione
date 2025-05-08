package generics;

import java.util.Scanner;

public class Coppia<T> {

    private T uno;
    private T due;

    // CONSTRUCTORS

    public Coppia() {

    }

    public Coppia(T uno, T due) {
        this.uno = uno;
        this.due = due;
    }

    // GETTERS & SETTERS

    public T getUno() {
        return uno;
    }

    public void setUno(T uno) {
        this.uno = uno;
    }

    public T getDue() {
        return due;
    }

    public void setDue(T due) {
        this.due = due;
    }

    public void setUnoDue(T uno, T due) {

        this.uno = uno;
        this.due = due;

    }

}
