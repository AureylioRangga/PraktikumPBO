package Quis1.Soal1;

import java.util.Date;

import Quis1.Soal1.Customer;
import Quis1.Soal1.Order;
import Quis1.Soal1.Product;

public class MainOrderSystem {
    public static void main(String[] args) {

        Customer c1 = new Customer(1, "Aureylio Rangga", "Jl. Kembang Kertas", "081234568910");

        Product p1 = new Product(117, 25000, "Makanan");
        Product p2 = new Product(118, 15000, "Minuman");

        Order o1 = new Order(1001, c1, 40000, new Date());
        o1.tambahProduct(p1);
        o1.tambahProduct(p2);

        Stock s1 = new Stock(p1, 50, 1);

        System.out.println("Customer ID   : " + c1.getCustomerId());
        System.out.println("Nama Customer : " + c1.getCustomerName());
        System.out.println("Address       : " + c1.getAddress());
        System.out.println("Phone         : " + c1.getPhone());
        System.out.println("Order ID      : " + o1.getOrderId());
        System.out.println("Total Amount  : " + o1.getAmount());

        System.out.println("\nDaftar Product dalam Order:");
        for (Product p : o1.getProductList()) {
            System.out.println("- " + p.getProductType() + " (ID: " + p.getProductId() + ", Harga: " + p.getProductPrice() + ")");
        }

        System.out.println("\nStock Info:");
        System.out.println("Product ID " + s1.getProduct().getProductId() + " : Jumlah: " + s1.getQuantity() + ", Toko: " + s1.getShopNo());
    }
}

