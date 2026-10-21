package Jobsheet08.Teori;

public class Ruko extends Bangunan {
    private String jenisUsaha;

    public Ruko(String kodeBangunan, String alamat, double luas, int lantai, String jenisUsaha) {
        super(kodeBangunan, alamat, luas, lantai);
        this.jenisUsaha = jenisUsaha;
    }

    @Override
    public double hitungPajak() {
        return luas * lantai * 7500;
    }

    @Override
    public double hitungBiayaPerawatan() {
        return luas * 10000 * 2;
    }
}

