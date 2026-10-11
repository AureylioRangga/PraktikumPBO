package Jobsheet07.Teori;

public class Rumah extends Bangunan {
    private int jumlahKamar;

    // Overloading constructor 1
    public Rumah() {
        super("BGN-000", "Belum ada alamat", 0, 0);
        this.jumlahKamar = 0;
    }
    // Overloading constructor 2
    public Rumah(String kodeBangunan, String alamat, double luas, int lantai, int jumlahKamar) {
        super(kodeBangunan, alamat, luas, lantai);
        this.jumlahKamar = jumlahKamar;
    }


    public int getJumlahKamar() {
        return jumlahKamar;
    }
    public void setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
    }


    // Override: menimpa method dari parent
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Data Rumah ===");
        super.tampilkanInfo();
        System.out.println("Kamar  : " + jumlahKamar);
    }

    // Override: biaya rumah = biaya dasar parent
    @Override
    public double hitungBiayaPerawatan() {
        return super.hitungBiayaPerawatan() + (jumlahKamar * 500000);
    }

    // Overloading method versi 1 
    public void hitungPajakPBB(double tarifPerMeter) {
        double pajak = getLuas() * tarifPerMeter;
        System.out.println("Pajak PBB rumah (" + jumlahKamar + " kamar) : Rp"
                + String.format("%.0f", pajak));
    }
    // Overloading method versi 2 (tambahan diskon)
    public void hitungPajakPBB(double tarifPerMeter, double diskonPersen) {
        double pajak = getLuas() * tarifPerMeter;
        double total = pajak - (pajak * diskonPersen / 100);
        System.out.println("Pajak PBB rumah setelah diskon "
                + String.format("%.0f", diskonPersen) + "% : Rp"
                + String.format("%.0f", total));
    }
}
