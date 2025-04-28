package esempiCorso;

public class Differenza {

    Double x;
    Double y;
    Double z;

    public Differenza(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double diff(Double x, Double y, Double z) {

        this.x = x;
        this.y = y;
        this.z = z;
        Double diff = x - y - z;
        return diff;
    }

    @Override
    public String toString() {
        Double diff = x - y - z;
        return "Differenza: " + diff + "\n";
    }
}
