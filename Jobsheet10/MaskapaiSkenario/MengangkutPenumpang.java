package Jobsheet10.MaskapaiSkenario;

public interface MengangkutPenumpang {
    // Atribut di interface hanya boleh konstanta (public static final)
    public static final int KAPASITAS_MAKS_KABIN = 300;
    public static final double BERAT_RATA_RATA_PENUMPANG_KG = 75.0;

    void naikkanPenumpang(int jumlah);
}

