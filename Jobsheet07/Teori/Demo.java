package Jobsheet07.Teori;

public class Demo {
    public static void main(String[] args) {
        Rumah rumah1 = new Rumah();
        Rumah rumah2 = new Rumah("BGN-001", "Jl. Soekarno Hatta No. 10, Malang", 120, 2, 3);
        Ruko ruko1 = new Ruko("BGN-002", "Jl. Veteran No. 25, Malang", 90, 3, "Toko Elektronik");

        System.out.println("===== 1. OVERLOADING CONSTRUCTOR =====");
        rumah1.tampilkanInfo();
        System.out.println();
        rumah2.tampilkanInfo();
        System.out.println();

        System.out.println("===== 2. OVERLOADING METHOD =====");
        rumah2.hitungPajakPBB(5000);
        rumah2.hitungPajakPBB(5000, 10);
        ruko1.cekIzinUsaha();
        ruko1.cekIzinUsaha("IZ-2026-045");
        System.out.println();

        // Perhitungannya: biaya dasar 120 × 10000 = 1200000, ditambah 3 kamar × 500000 = 1500000, sehingga totalnya 2700000.
        // Perhitungannya: biaya dasar 90 × 10000 = 900000, dikali 2 untuk ruko, sehingga totalnya 1800000.
        System.out.println("===== 3. OVERRIDING =====");
        Bangunan[] daftar = {rumah2, ruko1};
        for (Bangunan b : daftar) {
            b.tampilkanInfo();
            System.out.println("Biaya perawatan : Rp" + String.format("%.0f", b.hitungBiayaPerawatan()));
            System.out.println();
        }

        System.out.println("===== 4. FINAL =====");
        System.out.println("Kode rumah2 : " + rumah2.getKodeBangunan());
        System.out.println("Luas total rumah2 : " + String.format("%.0f", rumah2.hitungLuasTotal()) + " m2");
    }
}
