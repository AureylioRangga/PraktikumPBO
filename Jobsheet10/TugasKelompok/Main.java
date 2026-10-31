package Jobsheet10.TugasKelompok;

public class Main {
    public static void main(String[] args) {
        // 1. Buat objek dan simpan ke array bertipe induk (upcasting)
        Pesawat[] daftar = {
            new PesawatPenumpang("GA-101", 180),
            new PesawatKargo("CK-202", 5000),
            new PesawatAmfibi("AM-303", 20, 800, 4)
        };
        Bandara bandara = new Bandara("Utama");

        // 2. Proses tiap pesawat
        for (Pesawat p : daftar) {
            System.out.println("== " + p.getKodePesawat() + " ==");

            p.terbang();                       // polimorfisme: versi subclass yang jalan

            if (p instanceof MengangkutPenumpang) {
                ((MengangkutPenumpang) p).naikkanPenumpang(15);
            }
            if (p instanceof MengangkutKargo) {
                bandara.prosesBongkarMuat((MengangkutKargo) p, 500);
            }
            if (p instanceof BisaMendaratDiAir) {
                ((BisaMendaratDiAir) p).mendaratDiAir();
            }
            System.out.println();
        }

        // 3. Uji batas kapasitas: pesawat amfibi hanya punya 20 kursi
        System.out.println("== Uji kapasitas AM-303 ==");
        ((MengangkutPenumpang) daftar[2]).naikkanPenumpang(10);
    }
}

