package Jobsheet07.Teori;

public final class Ruko extends Bangunan {
    private String jenisUsaha;

    // Overloading constructor 1
    public Ruko() {
        super("BGN-000", "Belum ada alamat", 0, 0);
        this.jenisUsaha = "Belum ditentukan";
    }
    // Overloading constructor 2
    public Ruko(String kodeBangunan, String alamat, double luas, int lantai, String jenisUsaha) {
        super(kodeBangunan, alamat, luas, lantai);
        this.jenisUsaha = jenisUsaha;
    }


    public String getJenisUsaha() {
        return jenisUsaha;
    }
    public void setJenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }


    // Override: menimpa method dari parent
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Ruko ===");
        super.tampilkanInfo();
        System.out.println("Usaha  : " + jenisUsaha);
    }

    // Override (biaya ruko = biaya dasar parent * 2)
    @Override
    public double hitungBiayaPerawatan() {
        return super.hitungBiayaPerawatan() * 2;
    }


    // Overloading method versi 1 (tanpa parameter)
    public void cekIzinUsaha() {
        System.out.println("Ruko untuk usaha " + jenisUsaha
                + " wajib memiliki izin usaha.");
    }
    // Overloading method versi 2 (dengan parameter nomor izin)
    public void cekIzinUsaha(String nomorIzin) {
        System.out.println("Ruko untuk usaha " + jenisUsaha
                + " terdaftar dengan nomor izin " + nomorIzin + ".");
    }
}
