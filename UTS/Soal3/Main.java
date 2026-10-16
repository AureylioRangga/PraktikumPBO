package UTS.Soal3;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(101, "rahasia123", "Aureylio Rangga", 19, "rangga@mail.com");
        Admin adm = new Admin(1, "admin123", "Admin Sistem", 30, "admin@mail.com");

        System.out.println("=== Log in ===");
        cust.logIn(101, "salah");
        cust.logIn(101, "rahasia123");
        adm.logIn(1, "admin123");

        System.out.println("\n=== Alur verifikasi ===");
        System.out.println("Status awal: " + cust.getVerificationStatus());
        cust.applyVerification("ktp.docx"); 
        cust.applyVerification("ktp.jpg");   
        cust.getProfile().showDocuments();
        adm.verifyUser(cust);
        System.out.println("Status akhir: " + cust.getVerificationStatus());

        System.out.println("\n=== Kelola kendaraan & komplain ===");
        Vehicle v = adm.addVehicle();
        adm.updateVehicleDetails(v.getVehicleId(), "Honda", "Sepeda Motor");
        adm.receiveComplain("Kendaraan terlambat dikembalikan");
        adm.retrieveComplain();

        System.out.println("\n=== Edit profil, pemulihan password, log out ===");
        cust.getProfile().editProfile("Aureylio Rangga", 20, "rangga.baru@mail.com");
        cust.recoverPassword();
        cust.logOut();
    }
}

