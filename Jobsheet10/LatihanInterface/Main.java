package Jobsheet10.LatihanInterface;

public class Main {
    public static void main(String[] args) {
        // Instansiasi setiap concrete class
        Kipas kipas = new Kipas("Standing Fan", 350000, "Putih", "Cosmos");
        TV tv = new TV("LED", 20, 3500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 4500000, "Silver", "Sharp");
        SmartFridge smartFridge = new SmartFridge(10, 2, 8000000, "Hitam", "LG");

        // Tampilkan info
        System.out.println("=== Kipas ===");
        System.out.println(kipas.getInfo());

        System.out.println("\n=== TV ===");
        System.out.println(tv.getInfo());

        System.out.println("\n=== Kulkas ===");
        System.out.println(kulkas.getInfo());

        System.out.println("\n=== SmartFridge ===");
        System.out.println(smartFridge.getInfo());

        // Uji method dari interface Audible
        System.out.println("\n=== Uji Audible ===");
        tv.naikkanVolume(5);
        System.out.println("Volume TV setelah dinaikkan 5          : " + tv.getVolume());
        tv.turunkanVolume(10);
        System.out.println("Volume TV setelah diturunkan 10        : " + tv.getVolume());

        smartFridge.naikkanVolume(5);
        System.out.println("Volume SmartFridge setelah dinaikkan 5 : " + smartFridge.getVolume());
        smartFridge.turunkanVolume(3);
        System.out.println("Volume SmartFridge setelah diturunkan 3: " + smartFridge.getVolume());
    }
}

