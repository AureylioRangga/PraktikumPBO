package Quis1.Soal2;

public class Layanan {
    private String serviceName;
    private double servicePrice;

    public Layanan(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }


    public String getServiceName() {
        return serviceName;
    }
    public double getServicePrice() {
        return servicePrice;
    }


    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Layanan : " + serviceName);
        System.out.println("Harga        : Rp" + servicePrice);
    }
}
