package Jobsheet08.Teori;

public class Demo {
    public static void main(String[] args) {
        
        Bangunan rumah1 = new Rumah("BGN-001", "Jl. Soekarno Hatta No. 10, Malang", 120, 2, 3);
        Bangunan ruko1 = new Ruko("BGN-002", "Jl. Veteran No. 25, Malang", 90, 3, "Toko Elektronik");

        Bangunan[] daftar = {rumah1, ruko1};
        for (Bangunan b : daftar) {
            b.tampilkanInfo();
            System.out.println("Luas total      : " + String.format("%.0f", b.hitungLuasTotal()) + " m2");
            System.out.println("Pajak           : Rp" + String.format("%.0f", b.hitungPajak()));
            System.out.println("Biaya perawatan : Rp" + String.format("%.0f", b.hitungBiayaPerawatan()));
            System.out.println();
        }
    }
}

