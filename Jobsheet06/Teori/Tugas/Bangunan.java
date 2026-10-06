package Jobsheet06.Teori.Tugas;

public class Bangunan {
    private String alamat;
    private double luas;
    private int lantai;

    // Constructor tanpa parameter
    public Bangunan() {
        this.alamat = "Belum ada alamat";
        this.luas = 0;
        this.lantai = 0;
    }

    // Constructor berparameter (overloading)
    public Bangunan(String alamat, double luas, int lantai) {
        this.alamat = alamat;
        this.luas = luas;
        this.lantai = lantai;
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
        System.out.println("Alamat : " + alamat);
        System.out.println("Luas   : " + String.format("%.0f", luas) + " m2");
        System.out.println("Lantai : " + lantai);
    }

    public double hitungLuasTotal() {
        return luas * lantai;
    }
}

