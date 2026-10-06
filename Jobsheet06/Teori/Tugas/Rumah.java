package Jobsheet06.Teori.Tugas;

public class Rumah extends Bangunan {
    private int jumlahKamar;

    // Constructor tanpa parameter
    public Rumah() {
        super("Belum ada alamat", 0, 0);
        this.jumlahKamar = 0;
    }

    // Constructor berparameter
    public Rumah(String alamat, double luas, int lantai, int jumlahKamar) {
        super(alamat, luas, lantai);
        this.jumlahKamar = jumlahKamar;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }
    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Rumah ===");
        super.tampilkanInfo();
        System.out.println("Kamar  : " + jumlahKamar);
    }

    public void hitungPajakPBB(double tarifPerMeter) {
        double pajak = getLuas() * tarifPerMeter;
        System.out.println("Pajak PBB rumah (" + jumlahKamar + " kamar) : Rp"
                + String.format("%.0f", pajak));
    }
}
