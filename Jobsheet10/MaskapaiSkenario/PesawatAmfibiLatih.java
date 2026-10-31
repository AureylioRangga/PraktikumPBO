package Jobsheet10.MaskapaiSkenario;

public class PesawatAmfibiLatih extends PesawatAmfibiRingan {

    public PesawatAmfibiLatih(String kode) {
        super(kode);
    }

    @Override
    public void mendaratDiAir() {
        System.out.println("[" + getKodePesawat() + "] Mendarat di air (kedalaman min "
                + KEDALAMAN_MIN_AIR_M + " m)");
    }
}

