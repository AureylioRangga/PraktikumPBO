package Jobsheet03.Teori;

public class KipasAngin {

    private String merk;
    private String warna;
    private int kecepatanAngin;
    private String arahPutaran;
    private String mode;
    private boolean statusNyala;

    public static final int KECEPATAN_MAKSIMUM = 4;

    public KipasAngin(String merk, String warna, String arahPutaran, String mode) {
        this.merk = merk;
        this.warna = warna;
        this.arahPutaran = arahPutaran;
        this.mode = mode;
        this.kecepatanAngin = 0;
        this.statusNyala = false;
    }

    public String getMerk() {
        return merk;
    }

    // Read only
    public String getWarna() {
        return warna;
    }

    public int getKecepatanAngin() {
        return kecepatanAngin;
    }

    public String getArahPutaran() {
        return arahPutaran;
    }

    public void setArahPutaran(String arahBaru) {
        if (arahBaru != null &&
                (arahBaru.equalsIgnoreCase("Kiri") || arahBaru.equalsIgnoreCase("Kanan"))) {
            this.arahPutaran = arahBaru;
        } else {
            System.out.println(merk + " - Arah putaran tidak valid, gunakan \"Kiri\" atau \"Kanan\".");
        }
    }

    
    public String getMode() {
        return mode;
    }

    public boolean isStatusNyala() {
        return statusNyala;
    }


    public void nyalakan() {
        statusNyala = true;
        if (kecepatanAngin == 0) {
            kecepatanAngin = 0;
        }
        System.out.println(merk + " menyala dengan kecepatan " + kecepatanAngin + ".");
    }

    public void matikan() {
        statusNyala = false;
        kecepatanAngin = 0;
        System.out.println(merk + " dimatikan.");
    }

    public void tambahKecepatan(int increment) {
        if (statusNyala) {
            kecepatanAngin += increment;

            if (kecepatanAngin >= KECEPATAN_MAKSIMUM) {
                kecepatanAngin = 0;
                System.out.println(merk + " - Kecepatan mencapai maksimum, kembali ke pengaturan awal: " + kecepatanAngin);
            } else {
                System.out.println(merk + " - Kecepatan angin ditambah menjadi: " + kecepatanAngin);
            }
        } else {
            System.out.println(merk + " belum menyala.");
        }
    }

    public void kurangiKecepatan(int decrement) {
        if (statusNyala && kecepatanAngin > 0) {
            kecepatanAngin -= decrement;
            if (kecepatanAngin < 0) kecepatanAngin = 0;
            System.out.println(merk + " - Kecepatan angin dikurangi menjadi: " + kecepatanAngin);
        } else {
            System.out.println(merk + " - Kecepatan sudah minimum atau kipas belum menyala.");
        }
    }

    public void aturMode(String modeBaru) {
        if (mode != null && mode.equalsIgnoreCase(modeBaru)) {
            System.out.println(merk + " - Mode sudah " + mode + ", tidak perlu diganti.");
        } else {
            mode = modeBaru;
            System.out.println(merk + " - Mode diatur menjadi: " + mode);
        }
    }

    public void putarArah() {
        if (arahPutaran != null && arahPutaran.equalsIgnoreCase("Kiri")) {
            arahPutaran = "Kanan";
        } else {
            arahPutaran = "Kiri";
        }
        System.out.println(merk + " - Arah putaran sekarang: " + arahPutaran);
    }

    public void displayInfo() {
        System.out.println("Merk            : " + merk);
        System.out.println("Warna           : " + warna);
        System.out.println("Kecepatan Angin : " + kecepatanAngin);
        System.out.println("Arah Putaran    : " + arahPutaran);
        System.out.println("Mode            : " + mode);
        System.out.println("Status Nyala    : " + statusNyala);
    }
}