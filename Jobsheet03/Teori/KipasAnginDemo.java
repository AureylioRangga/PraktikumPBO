package Jobsheet03.Teori;

public class KipasAnginDemo {
    public static void main(String[] args) {

        KipasAngin kipas1 = new KipasAngin("Miyako", "Putih", "kanan", "Normal");
        KipasAngin kipas2 = new KipasAngin("Maspion", "Hitam", "kanan", "Silent");

        kipas1.nyalakan();
        kipas2.nyalakan();

        kipas1.tambahKecepatan(5);
        kipas2.tambahKecepatan(2);

        System.out.println();
        System.out.println("======= Kipas Angin 1 =======");
        kipas1.displayInfo();

        System.out.println("Cek via getter -> " + kipas1.getMerk() + " sedang " +
                (kipas1.isStatusNyala() ? "menyala" : "mati") + " di kecepatan " + kipas1.getKecepatanAngin());

        System.out.println();
        System.out.println("======= Kipas Angin 2 =======");
        kipas2.displayInfo();

        System.out.println();
        System.out.println("======= Uji Setter arahPutaran =======");
        kipas1.setArahPutaran("Kanan");    
        kipas2.setArahPutaran("kiri");     
    }
}