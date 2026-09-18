package Jobsheet03.Tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private long limitPinjaman;
    private long jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, long limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    // 4 getter
    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public long getLimitPinjaman() {
        return limitPinjaman;
    }

    public long getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Modifikasi Tugas no.1  
    public void pinjam(long nominal) {
        if (nominal <= 0) {
            System.out.println("Maaf, nominal pinjaman harus lebih dari 0.");
            return;
        }
        if (this.jumlahPinjaman + nominal > this.limitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    // Modifikasi Tugas no.2
    public void angsur(long nominal) {
        long minimalAngsuran = (long) Math.ceil(this.jumlahPinjaman * 0.1);

        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else if (nominal > this.jumlahPinjaman) {
            this.jumlahPinjaman = 0;
        } else {
            this.jumlahPinjaman -= nominal;
        }
    }
}

