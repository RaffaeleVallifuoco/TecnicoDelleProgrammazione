package esempiCorso;

public class Gatto {

    public String nome;
    public int age;
    public String razza;
    public Integer numeroCroccantini;

    public Gatto() {
    }

    public Gatto(String name, String razza, int age) {

        this.nome = name;
        this.razza = razza;
        this.age = age;

    }

    public Gatto(String name) {

        this.nome = name;

    }

    @Override
    public String toString() {
        return this.nome + " " +
                this.razza + " " +
                this.age + " " +
                numeroCroccantini;
    }
}
