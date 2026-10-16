package UTS.Soal2;

public class Kendaraan {
    protected String merek;
    protected int tahunProduksi;

    public Kendaraan(String merek, int tahunProduksi) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        System.out.println("Constructor Kendaraan dijalankan");
    }

    public void nyalakanMesin() {
        System.out.println("Mesin " + merek + " dinyalakan");
    }

    public void tampilkanInfo() {
        System.out.println("Kendaraan : " + merek + " (" + tahunProduksi + ")");
    }
}

