package Jobsheet4.TugasTeori;

import java.time.LocalDate;

public class Reservasi {
    private LocalDate tanggal;
    private Pegawai resepsionis;
    private Pegawai petugasRuang;

    public Reservasi(LocalDate tanggal, Pegawai resepsionis, Pegawai petugasRuang) {
        this.tanggal = tanggal;
        this.resepsionis = resepsionis;
        this.petugasRuang = petugasRuang;
    }

    public LocalDate getTanggal() { 
        return tanggal; 
    }
    public void setTanggal(LocalDate tanggal) { 
        this.tanggal = tanggal; 
    }

    public Pegawai getResepsionis() { 
        return resepsionis; 
    }
    public void setResepsionis(Pegawai resepsionis) { 
        this.resepsionis = resepsionis; 
    }

    public Pegawai getPetugasRuang() {
        return petugasRuang; 
    }
    
    public void setPetugasRuang(Pegawai petugasRuang) { this.petugasRuang = petugasRuang; }

    public String getInfo() {
        return "Reservasi[tanggal=" + tanggal
            + ", resepsionis=" + resepsionis.getNama()
            + ", petugasRuang=" + petugasRuang.getNama() + "]";
    }
}

