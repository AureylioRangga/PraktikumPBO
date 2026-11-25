package backend;

//ini adalah model;
public class MemberGym {

    private String nama;
    private int usia;
    private String paket;

    public MemberGym(String nama, int usia, String paket) {
        this.nama = nama;
        this.usia = usia;
        this.paket = paket;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public String getPaket() {
        return paket;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }
}
