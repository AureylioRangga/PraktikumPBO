package Quis1.Soal2;

import java.util.ArrayList;
import java.util.List;

public class MainBengkel {
    public static void main(String[] args) {

        Pelanggan pelanggan1 = new Pelanggan("Aureylio Rangga", "0812345678910");

        Kendaraan mobil1 = new Kendaraan("N 555 OS", "Mercy", "E250", "Mobil");
        Kendaraan mobil2 = new Kendaraan("N 5678 XH", "Toyota", "Fortuner GR 2.8", "Mobil");
        Kendaraan motor1 = new Kendaraan("N 5555 VAL", "Yamaha", "Aerox155", "Sepeda Motor");
        Kendaraan motor2 = new Kendaraan("B 11 GH", "HarleyDavidson", "UltraLimited", "Sepeda Motor");

        pelanggan1.tambahKendaraan(mobil1);
        pelanggan1.tambahKendaraan(mobil2);
        pelanggan1.tambahKendaraan(motor1);
        pelanggan1.tambahKendaraan(motor2);

        List<Layanan> daftarLayanan = new ArrayList<>();
        daftarLayanan.add(new Layanan("Ganti Oli", 100000));
        daftarLayanan.add(new Layanan("Servis Rutin", 150000));
        daftarLayanan.add(new Layanan("Ganti Ban", 200000));

        System.out.println("== Daftar Layanan Bengkel Maju ==");
        for (Layanan l : daftarLayanan) {
            l.tampilkanInfo();
            System.out.println("-----------------------------");
        }

        Karyawan karyawan1 = new Karyawan("R001", "Siswanto");

        Layanan layananDipilih = daftarLayanan.get(0);

        System.out.println("\n====== Informasi Pelanggan ======");
        System.out.println("Nama Pelanggan  : " + pelanggan1.getNama());
        System.out.println("Nomor Telepon   : " + pelanggan1.getNomorTelepon());

        System.out.println("\n===== Daftar Kendaraan =====");
        for (Kendaraan k : pelanggan1.getDaftarKendaraan()) {
            k.tampilkanInfo();
            System.out.println("-----------------------------");
        }

        System.out.println("\n====================== Layanan Dipilih: " + layananDipilih.getServiceName() + " =====================");
        for (Kendaraan k : pelanggan1.getDaftarKendaraan()) {
            double total = karyawan1.prosesLayanan(k, layananDipilih);
            System.out.println("Total biaya untuk " + k.getPlatNomor() + " (" + k.getTipeKendaraan() + ") : Rp" + total);
            System.out.println();
        }
    }
}

