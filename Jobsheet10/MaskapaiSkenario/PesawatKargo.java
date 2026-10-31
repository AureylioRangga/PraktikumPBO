package Jobsheet10.MaskapaiSkenario;

public class PesawatKargo extends Pesawat implements MengangkutKargo {
    private double kapasitasKargoKg;
    private double muatanKg;

    public PesawatKargo(String kode, double kapasitasKargoKg) {
        super(kode, 8000);
        // BERAT_KARGO_MAKS_KG berasal dari interface MengangkutKargo
        this.kapasitasKargoKg = Math.min(kapasitasKargoKg, BERAT_KARGO_MAKS_KG);
        this.muatanKg = 0;
    }

    public double getKapasitasKargoKg() {
        return kapasitasKargoKg;
    }

    public double getMuatanKg() {
        return muatanKg;
    }

    @Override
    public void terbang() {
        System.out.println("[" + getKodePesawat() + "] Pesawat kargo lepas landas");
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
}

