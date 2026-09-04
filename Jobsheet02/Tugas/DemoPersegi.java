package Jobsheet02.Tugas;

public class DemoPersegi {
    public static void main(String[] args) {
        
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.panjang = 10;
        persegi1.lebar = 5;

        persegi1.displayInfo();
        System.out.println("Luas     : " + persegi1.getLuas());
        System.out.println("Keliling : " + persegi1.getKeliling());


    }
}