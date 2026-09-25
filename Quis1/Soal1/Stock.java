package Quis1.Soal1;

public class Stock {
    private int quantity;
    private int shopNo;

    private Product product;

    public Stock(Product product, int quantity, int shopNo) {
        this.product = product;
        this.quantity = quantity;
        this.shopNo = shopNo;
    }


    public int getQuantity() {
        return quantity;
    }

    public int getShopNo() {
        return shopNo;
    }

    public Product getProduct() {
        return product;
    }

    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addStock() {
        System.out.println("Stock baru ditambahkan untuk product ID " + product.getProductId());
    }

    public void modifyStock(int productId) {
        System.out.println("Stock untuk product ID " + productId + " berhasil diubah");
    }

    public void selectStockItem(int productId) {
        System.out.println("Stock item untuk product ID " + productId + " dipilih");
    }
}
