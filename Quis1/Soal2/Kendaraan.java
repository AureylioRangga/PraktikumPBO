package Quis1.Soal2;

import java.util.ArrayList;
import java.util.List;

public class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan; 


    private Pelanggan pemilik;
   
    private List<Layanan> riwayatLayanan = new ArrayList<>();

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
    }

    
    public String getPlatNomor() {
        return platNomor;
    }
    public String getMerek() {
        return merek;
    }
    public String getModel() {
        return model;
    }
    public String getTipeKendaraan() {
        return tipeKendaraan;
    }
    public Pelanggan getPemilik() {
        return pemilik;
    }

    public List<Layanan> getRiwayatLayanan() {
        return riwayatLayanan;
    }


    public void setPemilik(Pelanggan pemilik) {
        this.pemilik = pemilik;
    }

    public void tambahRiwayatLayanan(Layanan layanan) {
        riwayatLayanan.add(layanan);
    }


    public void tampilkanInfo() {
        System.out.println("Plat Nomor : " + platNomor);
        System.out.println("Merek      : " + merek);
        System.out.println("Model      : " + model);
        System.out.println("Tipe       : " + tipeKendaraan);
    }
}

