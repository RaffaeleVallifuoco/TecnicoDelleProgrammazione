public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int numero = 10;
        char carattere = 'c';
        String stringa = "hellooo";
        System.out.println(String.format("numero  %s, stringa  %s", numero, stringa));

        People persona = new People("dario", "darini", 29);
        persona.presentati();

    }
}
