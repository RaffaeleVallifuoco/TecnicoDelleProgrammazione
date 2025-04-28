package mondoReale;

public class Cane {

    private String name;
    private int age;

    private static final int numeroZampe = 4;

    public Cane() {

    }

    public Cane(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static int getNumerozampe() {
        return numeroZampe;
    }

    public String bau() {
        return "Ciao sono " + this.name + "\n bauuuuuu";
    }
}
