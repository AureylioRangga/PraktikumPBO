package UTS.Soal2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Objek Mobil ===");
        Mobil mobil = new Mobil("Toyota Avanza", 2022, 5);
        mobil.nyalakanMesin();
        mobil.bukaBagasi();
        mobil.tampilkanInfo();

        System.out.println("\n=== Objek Motor ===");
        Motor motor = new Motor("Honda Vario", 2023, "Matic");
        motor.nyalakanMesin();
        motor.pasangHelm();
        motor.tampilkanInfo();

        System.out.println("\n=== Objek MobilListrik (turunan Mobil, cucu Kendaraan) ===");
        MobilListrik ev = new MobilListrik("Hyundai Ioniq 5", 2024, 5, 72);
        ev.nyalakanMesin();  
        ev.bukaBagasi();     
        ev.isiBaterai();     
        ev.tampilkanInfo();  
    }
}

