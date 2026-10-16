package UTS.Soal3;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private final List<String> complaints = new ArrayList<>();
    private int nextVehicleId = 1;

    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public Vehicle addVehicle() {
        Vehicle v = new Vehicle(nextVehicleId++, "Belum diisi", "Belum diisi");
        vehicles.add(v);
        System.out.println("Kendaraan ditambahkan: " + v);
        return v;
    }

    public void updateVehicleDetails(int vehicleId, String brand, String type) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == vehicleId) {
                v.setBrand(brand);
                v.setType(type);
                System.out.println("Kendaraan diperbarui: " + v);
                return;
            }
        }
        System.out.println("Kendaraan dengan id " + vehicleId + " tidak ditemukan.");
    }

    public void receiveComplain(String complain) { complaints.add(complain); }

    public void retrieveComplain() {
        System.out.println("Daftar komplain (" + complaints.size() + "):");
        for (String c : complaints) System.out.println(" - " + c);
    }

    public void verifyUser(Customer customer) {
        if (customer.getProfile().getDoc() != null) {
            customer.setVerificationStatus(true);
            System.out.println(customer.getProfile().getName() + " berhasil diverifikasi oleh admin.");
        } else {
            System.out.println(customer.getProfile().getName() + " belum mengunggah dokumen.");
        }
    }
}

