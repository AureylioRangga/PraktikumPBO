package Jobsheet02.Tugas;

public class KipasAnginDemo {
    public static void main(String[] args) {

        KipasAngin kipas1 = new KipasAngin();
        kipas1.merk = "Miyako";
        kipas1.warna = "Putih";
        kipas1.arahPutaran = "kiri";
        kipas1.mode = "Normal";
        kipas1.kecepatanAngin = 2;
        kipas1.statusNyala = true;

        KipasAngin kipas2 = new KipasAngin();
        kipas2.merk = "Maspion";
        kipas2.warna = "Hitam";
        kipas2.arahPutaran = "kiri";
        kipas2.mode = "Silent";
        kipas2.kecepatanAngin = 2;
        kipas2.statusNyala = true;

        kipas1.tambahKecepatan(1);
        kipas2.tambahKecepatan(2);

        System.out.println();
        System.out.println("======= Kipas Angin 1 =======");
        kipas1.displayInfo();
        System.out.println();
        System.out.println("======= Kipas Angin 2 =======");
        kipas2.displayInfo();
    }
}

