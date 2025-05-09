package coffee;

public class MacchinaCaffe {

    private String marca;
    private String modello;
    private Integer capacitàSerbatoio;
    private Integer capacitàSerbatoioMax;
    private Integer capacitàCassettoCapsule;
    private Integer capacitàCassettoCapsuleMax;
    private Integer caffeErogati = 0;
    private Integer caffeErogatiUltimoSvuotamento = 0;

    // GETTERS & SETTERS

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getCapacitàSerbatoio() {
        return capacitàSerbatoio;
    }

    public void setCapacitàSerbatoio(Integer capacitàSerbatoio) {
        this.capacitàSerbatoio = capacitàSerbatoio;
    }

    public Integer getCapacitàSerbatoioMax() {
        return capacitàSerbatoioMax;
    }

    public void setCapacitàSerbatoioMax(Integer capacitàSerbatoioMax) {
        this.capacitàSerbatoioMax = capacitàSerbatoioMax;
    }

    public Integer getCapacitàCassettoCapsule() {
        return capacitàCassettoCapsule;
    }

    public void setCapacitàCassettoCapsule(Integer capacitàCassettoCapsule) {
        this.capacitàCassettoCapsule = capacitàCassettoCapsule;
    }

    public Integer getCapacitàCassettoCapsuleMax() {
        return capacitàCassettoCapsuleMax;
    }

    public void setCapacitàCassettoCapsuleMax(Integer capacitàCassettoCapsuleMax) {
        this.capacitàCassettoCapsuleMax = capacitàCassettoCapsuleMax;
    }

    public Integer getCaffeErogati() {
        return caffeErogati;
    }

    public void setCaffeErogati(Integer caffeErogati) {
        this.caffeErogati = caffeErogati;
    }

    // CONSTRUCTORS

    public MacchinaCaffe() {

    }

    public MacchinaCaffe(String marca, String modello, Integer capacitàSerbatoio, Integer capacitàCassettoCapsule) {
        this.marca = marca;
        this.modello = modello;
        this.capacitàSerbatoio = capacitàSerbatoio;
        this.capacitàSerbatoioMax = capacitàSerbatoio;
        this.capacitàCassettoCapsule = capacitàCassettoCapsule;
        this.capacitàCassettoCapsuleMax = capacitàCassettoCapsule;
    }

    // METHODS

    public void eroga(String tipo) {
        Caffe caffe = switch (tipo.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "espressodoppio" -> new EspressoDoppio();
            default -> null;
        };

        if (caffe == null) {
            System.out.println("Tipo di caffè non valido");
            return;
        }

        if (this.capacitàSerbatoio >= caffe.getLunghezza()) {
            if (this.caffeErogatiUltimoSvuotamento < this.capacitàCassettoCapsule) {
                System.out.println("\nErogazione in corso ...\n");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                consumoCaffe(caffe);
            } else {
                System.out.println("Cassetto capsule pieno");
            }
        } else {
            System.out.println("Acqua insufficiente per erogare questo caffè");
        }
    }

    public void consumoCaffe(Caffe caffe) {
        this.capacitàSerbatoio -= caffe.getLunghezza();
        this.caffeErogati++;
        this.caffeErogatiUltimoSvuotamento++;
        ;
    }

    public void svuota() {
        System.out.println(
                "Sto svuotando ...");
        this.capacitàCassettoCapsule = this.capacitàCassettoCapsuleMax;
        this.caffeErogatiUltimoSvuotamento = 0;
    }

    public void riempi() {
        System.out.println(
                "Sto riempiendo...");
        this.capacitàSerbatoio = capacitàSerbatoioMax;
    }
}
