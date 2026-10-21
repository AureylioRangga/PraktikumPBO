package Jobsheet08.Teori;

public abstract class Bangunan {
    protected String kodeBangunan;
    protected String alamat;
    protected double luas;
    protected int lantai;

    public Bangunan(String kodeBangunan, String alamat, double luas, int lantai) {
        this.kodeBangunan = kodeBangunan;
        this.alamat = alamat;
        this.luas = luas;
        this.lantai = lantai;
    }

    // Concrete method
    public void tampilkanInfo() {
        System.out.println("Kode   : " + kodeBangunan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Luas   : " + String.format("%.0f", luas) + " m2");
        System.out.println("Lantai : " + lantai);
    }

    // Concrete method
    public double hitungLuasTotal() {
        return luas * lantai;
    }

    // Abstract method: tanpa isi, wajib diisi subclass
    public abstract double hitungPajak();
    public abstract double hitungBiayaPerawatan();
}

