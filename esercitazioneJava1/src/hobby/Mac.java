package hobby;

public class Mac {
    private final String brand = "Apple";
    private String modelName;
    private String productCode;
    private Double displayInch;
    private String socType;

    // ---------------------------------
    // --------- CONSTRUCTORS ----------
    // ---------------------------------

    public Mac() {
    }

    public Mac(String modelName, String productCode, double displayInch, String socType) {
        this.modelName = modelName;
        this.productCode = productCode;
        this.displayInch = displayInch;
        this.socType = socType;
    }

    // ---------------------------------
    // ------ GETTERS & SETTERS --------
    // ---------------------------------

    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(Double displayInch) {
        this.displayInch = displayInch;
    }

    public String getSocType() {
        return socType;
    }

    public void setSocType(String socType) {
        this.socType = socType;
    }

    // ---------------------------------
    // ------------- METHODS -----------
    // ---------------------------------

    @Override
    public String toString() {
        return String.format(
                "Product Details:\n - Brand: %s\n - Model Name: %s\n - Product Code: %s\n - Display (inch): %f\n - SoC Type: %s \n",
                brand, modelName, productCode, displayInch, socType);
    }

}
