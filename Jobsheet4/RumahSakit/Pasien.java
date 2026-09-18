package Jobsheet4.RumahSakit;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<Konsultasi> riwayatKonsultasi; // keranjang

    public Pasien(String noRekamMedis, String nama) {
        this.noRekamMedis = noRekamMedis;
        this.nama = nama;
        this.riwayatKonsultasi = new ArrayList<Konsultasi>();
    }
    
    // getter setter biasa untuk norekmamedis dan nama
    public String getNoRekamMedis () {
        return noRekamMedis;
    }
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }


    public void tambahKonsultasi(LocalDate tanggal, Pegawai dokter, Pegawai perawat) {
        Konsultasi konsultasi = new Konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }


    public String getInfo() {
        String info = "";
        info += "No RekamMedis      : " + this.noRekamMedis + "\n"; // menampilkan identitas
        info += "Nama               : " + this.nama + "\n";
        
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat Konsultasi :\n";   // cek

            for (Konsultasi konsultasi : riwayatKonsultasi) {
                info += konsultasi.getInfo();   // dokter & perawat
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n"; 


        return info;        
    }

}

