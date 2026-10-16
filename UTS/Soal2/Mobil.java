package UTS.Soal2;

public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    public Mobil(String merek, int tahunProduksi, int jumlahPintu) {
        super(merek, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        System.out.println("Constructor Mobil dijalankan");
    }

    public void bukaBagasi() {
        System.out.println("Bagasi mobil " + merek + " dibuka");
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mobil     : " + merek + " (" + tahunProduksi + "), " + jumlahPintu + " pintu");
    }
}
