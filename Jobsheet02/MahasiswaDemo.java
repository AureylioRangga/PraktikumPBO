package Jobsheet02;

public class MahasiswaDemo {
    public static  void main(String[] args) {
    
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "02342"; 
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "244107060163";
        m2.nama = "Aureylio Rangga Hazaify Meiyo";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2F";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "2552043242";
        m3.nama = "Riqzky Febian";
        m3.alamat = "Jakarta, DKI Jakarta";
        m3.kelas = "2B";

        System.out.println("====== Biodata Mahasiswa 1 ======");
        m1.displayBiodata(); 
        System.out.println();
        System.out.println("====== Biodata Mahasiswa 2 ======");
        m2.displayBiodata();
        System.out.println();
        System.out.println("====== Biodata Mahasiswa 3 ======");
        m3.displayBiodata();
    }
}