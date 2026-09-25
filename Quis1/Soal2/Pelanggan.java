package Quis1.Soal2;

import java.util.ArrayList;
import java.util.List;

public class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private List<Kendaraan> daftarKendaraan = new ArrayList<>();

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }


    public String getNama() {
        return nama;
    }
    public String getNomorTelepon() {
        return nomorTelepon;
    }
    public List<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }


    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }


    public void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
        kendaraan.setPemilik(this);
    }
}

