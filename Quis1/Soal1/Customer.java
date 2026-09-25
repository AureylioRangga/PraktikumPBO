package Quis1.Soal1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phone;
    private List<Order> orderList = new ArrayList<>();

    public Customer(int customerId, String customerName, String address, String phone) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public List<Order> getOrderList() {
        return orderList;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    void tambahOrder(Order order) {
        orderList.add(order);
    }

    public void addCustomer() {
        System.out.println("Customer baru ditambahkan: " + customerName);
    }

    public void editCustomer() {
        System.out.println("Data customer " + customerName + " berhasil diedit");
    }

    public void deleteCustomer() {
        System.out.println("Customer " + customerName + " dihapus");
    }
}

