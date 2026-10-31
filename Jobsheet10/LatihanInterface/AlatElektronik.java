package Jobsheet10.LatihanInterface;

public abstract class AlatElektronik {
    private double harga;
    private String warna;
    private String merk;

    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getInfo() {
        return "Merk         : " + merk
             + "\nWarna        : " + warna
             + "\nHarga        : Rp " + String.format("%.0f", harga);
    }
}
