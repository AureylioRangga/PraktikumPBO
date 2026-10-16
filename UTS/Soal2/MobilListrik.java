package UTS.Soal2;

public class MobilListrik extends Mobil {
    private int kapasitasBaterai; 
    public MobilListrik(String merek, int tahunProduksi, int jumlahPintu, int kapasitasBaterai) {
        super(merek, tahunProduksi, jumlahPintu);
        this.kapasitasBaterai = kapasitasBaterai;
        System.out.println("Constructor MobilListrik dijalankan");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai " + kapasitasBaterai + " kWh pada " + merek);
    }

    @Override
    public void nyalakanMesin() {
        System.out.println("Motor listrik " + merek + " aktif tanpa suara mesin");
    }
}
