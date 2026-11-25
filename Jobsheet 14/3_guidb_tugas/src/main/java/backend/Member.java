package backend;

public class Member {

    private int id;
    private String nama;
    private String alamat;
    private String noHp;
    private String email;          // kolom baru
    private String jenisMember;
    private String tanggalDaftar;  // kolom baru, format yyyy-MM-dd
    private String status;         // kolom baru: aktif / tidak aktif

    // Konstruktor lengkap (dipakai saat membaca data & update)
    public Member(int id, String nama, String alamat, String noHp, String email,
                  String jenisMember, String tanggalDaftar, String status) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
        this.jenisMember = jenisMember;
        this.tanggalDaftar = tanggalDaftar;
        this.status = status;
    }

    // Konstruktor tanpa id (dipakai saat menambah data baru)
    public Member(String nama, String alamat, String noHp, String email,
                  String jenisMember, String tanggalDaftar, String status) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
        this.jenisMember = jenisMember;
        this.tanggalDaftar = tanggalDaftar;
        this.status = status;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getNoHp() { return noHp; }
    public String getEmail() { return email; }
    public String getJenisMember() { return jenisMember; }
    public String getTanggalDaftar() { return tanggalDaftar; }
    public String getStatus() { return status; }

    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setNoHp(String noHp) { this.noHp = noHp; }
    public void setEmail(String email) { this.email = email; }
    public void setJenisMember(String jenisMember) { this.jenisMember = jenisMember; }
    public void setTanggalDaftar(String tanggalDaftar) { this.tanggalDaftar = tanggalDaftar; }
    public void setStatus(String status) { this.status = status; }
}
