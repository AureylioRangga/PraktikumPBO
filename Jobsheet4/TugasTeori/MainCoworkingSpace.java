package Jobsheet4.TugasTeori;

import java.time.LocalDate;

public class MainCoworkingSpace {
    public static void main(String[] args) {
        Pegawai resepsionis = new Pegawai("PG001", "Bu Rina");
        Pegawai petugasRuang = new Pegawai("PG002", "Pak Joko");

        Member member1 = new Member("MB001", "Rey");
        member1.tambahReservasi(LocalDate.of(2026, 9, 16), resepsionis, petugasRuang);
        member1.tambahReservasi(LocalDate.of(2026, 9, 20), resepsionis, petugasRuang);

        member1.tampilRiwayatReservasi();
        System.out.println(member1.getInfo());
    }
}
