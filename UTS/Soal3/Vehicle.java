package UTS.Soal3;

public class Vehicle {
    private int vehicleId;
    private String brand;
    private String type;

    public Vehicle(int vehicleId, String brand, String type) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.type = type;
    }

    public int getVehicleId() { return vehicleId; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setType(String type)   { this.type = type; }

    @Override
    public String toString() {
        return "Vehicle[id=" + vehicleId + ", merek=" + brand + ", tipe=" + type + "]";
    }
}
