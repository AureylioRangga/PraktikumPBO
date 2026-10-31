package Jobsheet10.TugasKelompok;

public class Bandara {
    private String nama;

    public Bandara(String nama) {
        this.nama = nama;
    }

    // Menerima tipe interface: PesawatKargo maupun PesawatAmfibi sama-sama bisa dipakai
    public void prosesBongkarMuat(MengangkutKargo pengangkut, double beratKg) {
        System.out.println("Bandara " + nama + ": proses bongkar muat dimulai");
        pengangkut.muatKargo(beratKg);
    }
}
