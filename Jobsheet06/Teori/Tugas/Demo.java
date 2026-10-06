package Jobsheet06.Teori.Tugas;

public class Demo {
    public static void main(String[] args) {
        // Instansiasi dengan constructor tanpa parameter
        Rumah rumah1 = new Rumah();
        Ruko ruko1 = new Ruko();

        // Instansiasi dengan constructor berparameter
        Rumah rumah2 = new Rumah("Jl. Soekarno Hatta No. 10, Malang", 120, 2, 3);
        Ruko ruko2 = new Ruko("Jl. Veteran No. 25, Malang", 90, 3, "Toko Elektronik");

        System.out.println("===== SEBELUM MODIFIKASI =====");
        rumah1.tampilkanInfo();
        System.out.println();
        rumah2.tampilkanInfo();
        System.out.println();
        ruko1.tampilkanInfo();
        System.out.println();
        ruko2.tampilkanInfo();
        System.out.println();

        // Modifikasi atribut warisan (dari Bangunan) dan atribut milik child
        rumah1.setAlamat("Jl. Ijen No. 5, Malang");
        rumah1.setLuas(150);                        
        rumah1.setLantai(2);                      
        rumah1.setJumlahKamar(4);            // milik Rumah

        ruko2.setLuas(100);                         // warisan
        ruko2.setJenisUsaha("Warung Kopi");   // milik Ruko

        System.out.println("===== SESUDAH MODIFIKASI =====");
        rumah1.tampilkanInfo();
        rumah1.hitungPajakPBB(5000);
        System.out.println();
        ruko2.tampilkanInfo();
        System.out.println("Luas total : " + String.format("%.0f", ruko2.hitungLuasTotal()) + " m2");
    }
}

