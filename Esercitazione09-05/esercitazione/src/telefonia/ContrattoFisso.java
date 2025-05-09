package telefonia;

public class ContrattoFisso extends ContrattoTelefonico {
    private String userAddress;

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    // CONSTRUCTORS

    public ContrattoFisso() {
    }

    public ContrattoFisso(String username, String numero, String userAddress) {
        super(username, numero);
        this.userAddress = userAddress;

    }

}
