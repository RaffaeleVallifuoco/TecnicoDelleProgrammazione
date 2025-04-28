public class People {

    String name;
    String lastName;
    int age;

    public People(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void presentati() {
        System.out.println(String.format(" Ciao, sono %s %s e ho %d anni", name, lastName, age));
    }

}
