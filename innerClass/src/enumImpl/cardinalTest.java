package enumImpl;

public class cardinalTest {
    public static void main(String[] args) {
        System.out.println(" is opposite");
        System.out.println(Cardinal.NORD.isOpposite(Cardinal.SUD));
        System.out.println(" mix ");
        Cardinal.mix(Cardinal.NORD, Cardinal.SUD);
        System.out.println(Cardinal.mix(Cardinal.NORD, Cardinal.EAST));

    }
}
