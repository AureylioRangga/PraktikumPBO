package Quis1.Soal1;

public class Product {
    private int productId;
    private double productPrice;
    private String productType;

    public Product(int productId, double productPrice, String productType) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void addProduct() {
        System.out.println("Product baru ditambahkan, ID: " + productId);
    }

    public void modifyProduct() {
        System.out.println("Product ID " + productId + " berhasil diubah");
    }

    public void selectProduct(int productId) {
        System.out.println("Product dengan ID " + productId + " dipilih");
    }
}
