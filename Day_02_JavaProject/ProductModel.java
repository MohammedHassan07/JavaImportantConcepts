package Day_02_JavaProject;

public class ProductModel {

    public ProductModel() {
    }

    private String productName, productType, productPlace;
    int productWarranty;

    public ProductModel(String productName, String productType, String productPlace, int productWarranty) {
        this.productName = productName;
        this.productType = productType;
        this.productPlace = productPlace;
        this.productWarranty = productWarranty;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    public int getProductWarranty() {
        return productWarranty;
    }

    public void setProductWarranty(int productWarranty) {
        this.productWarranty = productWarranty;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productPlace='" + productPlace + '\'' +
                ", productWarranty=" + productWarranty +
                '}';
    }
}


