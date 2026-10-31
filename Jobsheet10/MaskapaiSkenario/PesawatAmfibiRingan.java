package Jobsheet10.MaskapaiSkenario;

public abstract class PesawatAmfibiRingan extends Pesawat implements MengangkutPenumpang, BisaMendaratDiAir {

    public PesawatAmfibiRingan(String kode) {
        super(kode, 900);
    }

    @Override
    public void terbang() {
        System.out.println("[" + getKodePesawat() + "] Pesawat amfibi ringan lepas landas");
    }

    @Override
    public void naikkanPenumpang(int jumlah) {
        System.out.println("[" + getKodePesawat() + "] " + jumlah + " penumpang naik (maks "
                + KAPASITAS_MAKS_KABIN + " kursi)");
    }

    // mendaratDiAir() tetap belum diimplementasikan -> tugas subclass konkret
}
