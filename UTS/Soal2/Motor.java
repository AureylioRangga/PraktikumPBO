package UTS.Soal2;

public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merek, int tahunProduksi, String jenisMotor) {
        super(merek, tahunProduksi);
        this.jenisMotor = jenisMotor;
        System.out.println("Constructor Motor dijalankan");
    }

    public void pasangHelm() {
        System.out.println("Pengendara memasang helm sebelum mengendarai " + merek);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Motor     : " + merek + " (" + tahunProduksi + "), jenis " + jenisMotor);
    }
}
