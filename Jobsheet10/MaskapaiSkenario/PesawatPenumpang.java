package Jobsheet10.MaskapaiSkenario;

public class PesawatPenumpang extends Pesawat implements MengangkutPenumpang {
    private int jumlahKursi;
    private int penumpangTerisi;

    public PesawatPenumpang(String kode, int jumlahKursi) {
        super(kode, 6000);
        // KAPASITAS_MAKS_KABIN berasal dari interface MengangkutPenumpang
        this.jumlahKursi = Math.min(jumlahKursi, KAPASITAS_MAKS_KABIN);
        this.penumpangTerisi = 0;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getPenumpangTerisi() {
        return penumpangTerisi;
    }

    @Override
    public void terbang() {
        System.out.println("[" + getKodePesawat() + "] Pesawat penumpang lepas landas");
    }

    @Override
    public void naikkanPenumpang(int jumlah) {
        if (penumpangTerisi + jumlah > jumlahKursi) {
            System.out.println("[" + getKodePesawat() + "] Ditolak: kursi tersisa "
                    + (jumlahKursi - penumpangTerisi));
            return;
        }
        penumpangTerisi += jumlah;
        double beratTotal = jumlah * BERAT_RATA_RATA_PENUMPANG_KG;
        System.out.println("[" + getKodePesawat() + "] " + jumlah + " penumpang naik ("
                + penumpangTerisi + "/" + jumlahKursi + " kursi, +" + beratTotal + " kg)");
    }
}

