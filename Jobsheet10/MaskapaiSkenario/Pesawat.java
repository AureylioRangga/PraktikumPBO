package Jobsheet10.MaskapaiSkenario;

public abstract class Pesawat {
    private String kodePesawat;
    private int jarakMaks;

    public Pesawat(String kodePesawat, int jarakMaks) {
        this.kodePesawat = kodePesawat;
        this.jarakMaks = jarakMaks;
    }

    // Method konkret: ditulis sekali, diwariskan ke semua subclass
    public String getKodePesawat() {
        return kodePesawat;
    }

    public int getJarakMaks() {
        return jarakMaks;
    }

    // Method abstract: wajib ditimpa oleh setiap subclass
    public abstract void terbang();
}

