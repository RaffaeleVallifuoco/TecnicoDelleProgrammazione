package corse;

import java.util.List;
import java.util.Random;

public class Gara {
    private String circuito;
    private Pilota vincitore;
    private List<Pilota> grigliaDiPartenza;

    // CONSTRUCTORS

    public Gara() {

    }

    public Gara(String circuito, List<Pilota> grigliaDiPartenza) {
        this.circuito = circuito;
        this.grigliaDiPartenza = grigliaDiPartenza;
    }

    // GETTER & SETTER

    public String getCircuito() {
        return circuito;
    }

    public void setCircuito(String circuito) {
        this.circuito = circuito;
    }

    public Pilota getVincitore() {
        return vincitore;
    }

    public void setVincitore(Pilota vincitore) {
        this.vincitore = vincitore;
    }

    public List<Pilota> getGrigliaDiPartenza() {
        return grigliaDiPartenza;
    }

    public void setGrigliaDiPartenza(List<Pilota> grigliaDiPartenza) {
        this.grigliaDiPartenza = grigliaDiPartenza;
    }

    // METHODS

    void partenza() {
        if (grigliaDiPartenza.isEmpty()) {
            System.out.println("Nessun pilota in griglia");
            return;
        }
        estraiVincitore();

    }

    public void estraiVincitore() {
        Random random = new Random();
        int indiceVincente = random.nextInt(grigliaDiPartenza.size());
        vincitore = grigliaDiPartenza.get(indiceVincente);
        vincitore.setGareVinte(vincitore.getGareVinte() + 1);

    }

}
