package Jobsheet07.Teori;

public class Bangunan {
    private final String kodeBangunan;   // final atribut
    private String alamat;
    private double luas;
    private int lantai;

    // Overloading Konstructor 1: tanpa parameter
    public Bangunan() {
        this.kodeBangunan = "BGN-000";
        this.alamat = "Belum ada alamat";
        this.luas = 0;
        this.lantai = 0;
    }

    // Overloading Konstructor 2: berparameter
    public Bangunan(String kodeBangunan, String alamat, double luas, int lantai) {
        this.kodeBangunan = kodeBangunan;
        this.alamat = alamat;
        this.luas = luas;
        this.lantai = lantai;
    }


    public String getKodeBangunan() {
        return kodeBangunan;
    }
    public String getAlamat() {
        return alamat;
    }
    public double getLuas() {
        return luas;
    }
    public int getLantai() {
        return lantai;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }
    public void setLantai(int lantai) {
        this.lantai = lantai;
    }


    public void tampilkanInfo() {
        System.out.println("Kode   : " + kodeBangunan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Luas   : " + String.format("%.0f", luas) + " m2");
        System.out.println("Lantai : " + lantai);
    }

    public double hitungBiayaPerawatan() {
        return luas * 10000;
    }

    // Final method tidak dapat dioverride oleh subclass
    public final double hitungLuasTotal() {
        return luas * lantai;
    }
}

