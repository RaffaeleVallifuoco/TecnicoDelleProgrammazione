package cerchio;

public class Cerchio {

    private static final double PI_GRECO = 3.14;
    private double raggio;

    //
    public double getPI_GRECO() {
        return PI_GRECO;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    // ---------------------------------
    // --------- CONSTRUCTORS ----------
    // ---------------------------------

    public Cerchio(double raggio) {
        this.raggio = raggio;
    }

    // ---------------------------------
    // ------------- METHODS -----------
    // ---------------------------------

    public static double circonferenza(double raggio) {
        return 2 * PI_GRECO * raggio;
    }

    public static double areaCerchio(double raggio) {
        return PI_GRECO * raggio * raggio;
    }

}
