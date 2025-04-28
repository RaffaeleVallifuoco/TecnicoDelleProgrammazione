package animali;

public class Gatto {

    private String name;

    public Gatto() {

    }

    public Gatto(String name) {
        this.name = name;
    }

    public String miao() {
        return "Ciao sono " + this.name + "\n miaooooo";
    }

}
