package Jobsheet4.TugasTeori;

import java.time.LocalDate;
import java.util.ArrayList;

public class Member {
    private String idMember;
    private String nama;
    private ArrayList<Reservasi> riwayatReservasi;

    public Member(String idMember, String nama) {
        this.idMember = idMember;
        this.nama = nama;
        this.riwayatReservasi = new ArrayList<>();
    }

    public String getIdMember() { 
        return idMember; 
    }

    public void setIdMember(String idMember) { 
        this.idMember = idMember; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public void setNama(String nama) { this.nama = nama; }

    public String getInfo() {
        return "Member[idMember=" + idMember + ", nama=" + nama
            + ", jumlahReservasi=" + riwayatReservasi.size() + "]";
    }

    
    public void tambahReservasi(LocalDate tanggal, Pegawai resepsionis, Pegawai petugasRuang) {
        Reservasi r = new Reservasi(tanggal, resepsionis, petugasRuang);
        riwayatReservasi.add(r);
    }

    public void tampilRiwayatReservasi() {
        System.out.println("Riwayat reservasi " + nama + ":");
        for (Reservasi r : riwayatReservasi) {
            System.out.println("- " + r.getInfo());
        }
    }
}

