package Quis1.Soal2;

import java.util.ArrayList;
import java.util.List;

public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;

    private List<Layanan> daftarLayananDitangani = new ArrayList<>();

    public Karyawan(String idKaryawan, String namaKaryawan) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
    }


    public String getIdKaryawan() {
        return idKaryawan;
    }
    public String getNamaKaryawan() {
        return namaKaryawan;
    }
    public List<Layanan> getDaftarLayananDitangani() {
        return daftarLayananDitangani;
    }


    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    
    public double prosesLayanan(Kendaraan kendaraan, Layanan layanan) {
        double biayaTambahan = kendaraan.getTipeKendaraan().equalsIgnoreCase("Mobil") ? 50000 : 20000;
        double total = layanan.getServicePrice() + biayaTambahan;

        kendaraan.tambahRiwayatLayanan(layanan);
        daftarLayananDitangani.add(layanan);

        System.out.println("Karyawan " + namaKaryawan + " memproses servis untuk " + kendaraan.getMerek() + " " + kendaraan.getModel() + " (" + kendaraan.getTipeKendaraan() + ") - " + kendaraan.getPlatNomor());
        return total;
    }
}

