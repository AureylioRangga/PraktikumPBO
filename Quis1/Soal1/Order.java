package Quis1.Soal1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int orderId;
    private double amount;
    private Date orderDate;

   
    private Customer customer;
    
    private List<Product> productList = new ArrayList<>();

    public Order(int orderId, Customer customer, double amount, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
        this.orderDate = orderDate;
       
        customer.tambahOrder(this);
    }

    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProductList() {
        return productList;
    }


    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void tambahProduct(Product product) {
        productList.add(product);
    }

    public void createOrder() {
        System.out.println("Order baru dibuat, ID: " + orderId);
    }

    public void editOrder(int orderId) {
        System.out.println("Order ID " + orderId + " berhasil diedit");
    }
}
