package Jobsheet03;

public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        }
        else{
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan:" + this.kecepatan);
        System.out.println("=========================");
    }
    
    public String getPlatNomor() {
        return platNomor;
    }

    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    
    public boolean isIsMesinOn() {
        return isMesinOn;
    }

    public void setIsMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    // validasi Percobaan 2 langkah 7, + jawaban Pertanyaan no. 4 (maks 100) & no. 5 (tidak boleh negatif)
    public void setKecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh bertambah karena Mesin Off!");
        }
        else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh bernilai negatif");
        }
        else if (kecepatan > 100) {
            System.out.println("Kecepatan tidak boleh melebihi 100, kecepatan diset ke 100");
            this.kecepatan = 100;
        }
        else{
            this.kecepatan = kecepatan;
        }
    }
}