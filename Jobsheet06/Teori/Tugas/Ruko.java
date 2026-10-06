package Jobsheet06.Teori.Tugas;

public class Ruko extends Bangunan {
    private String jenisUsaha;

    // Constructor tanpa parameter
    public Ruko() {
        super("Belum ada alamat", 0, 0);
        this.jenisUsaha = "Belum ditentukan";
    }

    // Constructor berparameter
    public Ruko(String alamat, double luas, int lantai, String jenisUsaha) {
        super(alamat, luas, lantai);
        this.jenisUsaha = jenisUsaha;
    }

    public String getJenisUsaha() {
        return jenisUsaha;
    }
    public void setJenisUsaha(String jenisUsaha) {
        this.jenisUsaha = jenisUsaha;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Ruko ===");
        super.tampilkanInfo();
        System.out.println("Usaha  : " + jenisUsaha);
    }

    public void cekIzinUsaha() {
        System.out.println("Ruko untuk usaha " + jenisUsaha
                + " wajib memiliki izin usaha.");
    }
}
