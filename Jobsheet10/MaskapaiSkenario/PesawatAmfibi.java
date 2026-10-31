package Jobsheet10.MaskapaiSkenario;

// extends ditulis dulu, baru implements (boleh banyak interface)
public class PesawatAmfibi extends Pesawat
        implements MengangkutPenumpang, MengangkutKargo, BisaMendaratDiAir {

    private int jumlahKursi;
    private int penumpangTerisi;
    private double kapasitasKargoKg;
    private double muatanKg;
    private int jumlahPelampung;
    private boolean sedangDiAir;

    public PesawatAmfibi(String kode, int jumlahKursi, double kapasitasKargoKg, int jumlahPelampung) {
        super(kode, 1500);
        this.jumlahKursi = Math.min(jumlahKursi, KAPASITAS_MAKS_KABIN);
        this.penumpangTerisi = 0;
        this.kapasitasKargoKg = Math.min(kapasitasKargoKg, BERAT_KARGO_MAKS_KG);
        this.muatanKg = 0;
        this.jumlahPelampung = jumlahPelampung;
        this.sedangDiAir = false;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getPenumpangTerisi() {
        return penumpangTerisi;
    }

    public double getKapasitasKargoKg() {
        return kapasitasKargoKg;
    }

    public double getMuatanKg() {
        return muatanKg;
    }

    public int getJumlahPelampung() {
        return jumlahPelampung;
    }

    public boolean isSedangDiAir() {
        return sedangDiAir;
    }

    @Override
    public void terbang() {
        sedangDiAir = false;
        System.out.println("[" + getKodePesawat() + "] Pesawat amfibi lepas landas");
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

    @Override
    public void muatKargo(double beratKg) {
        if (muatanKg + beratKg > kapasitasKargoKg) {
            System.out.println("[" + getKodePesawat() + "] Ditolak: sisa kapasitas "
                    + (kapasitasKargoKg - muatanKg) + " kg");
            return;
        }
        muatanKg += beratKg;
        System.out.println("[" + getKodePesawat() + "] Memuat kargo " + beratKg + " kg ("
                + muatanKg + "/" + kapasitasKargoKg + " kg)");
    }

    @Override
    public void mendaratDiAir() {
        sedangDiAir = true;
        System.out.println("[" + getKodePesawat() + "] Mendarat di air (kedalaman min "
                + KEDALAMAN_MIN_AIR_M + " m), " + jumlahPelampung + " pelampung dikembangkan");
    }
}

