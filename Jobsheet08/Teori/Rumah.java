package Jobsheet08.Teori;

public class Rumah extends Bangunan {
    private int jumlahKamar;

    public Rumah(String kodeBangunan, String alamat, double luas, int lantai, int jumlahKamar) {
        super(kodeBangunan, alamat, luas, lantai);
        this.jumlahKamar = jumlahKamar;
    }

    @Override
    public double hitungPajak() {
        return luas * 5000;
    }

    @Override
    public double hitungBiayaPerawatan() {
        return (luas * 10000) + (jumlahKamar * 500000);
    }
}

