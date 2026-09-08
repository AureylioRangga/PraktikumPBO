package Jobsheet03.Tugas;

public class TestKoperasi
{
    public static void main(String[] args)
    {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000");
        anggota1.pinjam(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        // Tugas no.2 (minimal angsuran 10%)
        System.out.println("\n--- Uji coba validasi angsuran minimal 10% ---");
        Anggota anggota2 = new Anggota("222444555", "Rina", 5000000);
        anggota2.pinjam(2000000);
        System.out.println("Jumlah pinjaman anggota2: " + anggota2.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 100.000 (kurang dari 10%)...");
        anggota2.angsur(100000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota2.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 200.000 (tepat 10%)...");
        anggota2.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota2.getJumlahPinjaman());
    }
}

