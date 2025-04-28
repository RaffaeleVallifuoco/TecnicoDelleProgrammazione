package mondoReale;

import java.time.LocalDateTime;

public class Telecomando {
    private String serialCode;
    private String model;
    private String brand;
    private LocalDateTime productionDate = LocalDateTime.now();

    public Telecomando() {

    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDateTime getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDateTime productionDate) {
        this.productionDate = productionDate;
    }

    public Telecomando(String serialCode, String model, String brand, LocalDateTime productionDate) {
        this.serialCode = serialCode;
        this.model = model;
        this.brand = brand;
        this.productionDate = productionDate;
    }

}
