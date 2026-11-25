package backend;

public class Member {

    private int id;
    private String nama;
    private String alamat;
    private String noHp;
    private String jenisMember;

    public Member(int id, String nama, String alamat, String noHp, String jenisMember) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.jenisMember = jenisMember;
    }

    public Member(String nama, String alamat, String noHp, String jenisMember) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.jenisMember = jenisMember;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getNoHp() { return noHp; }
    public String getJenisMember() { return jenisMember; }

    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setNoHp(String noHp) { this.noHp = noHp; }
    public void setJenisMember(String jenisMember) { this.jenisMember = jenisMember; }
}
