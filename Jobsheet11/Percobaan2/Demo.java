public static void main(String[] args) {
    Dosen dosen1 = new Dosen("19940201", "Widia, S.Kom. M.Kom", "199402");

    Pegawai pegawai1 = dosen1;

    System.out.println(pegawai1.nip);
    System.out.println(pegawai1.nama);
    pegawai1.displayInfo();

    Dosen newDosen = (Dosen) pegawai1; // downcasting

    System.out.println(newDosen.nama);
    System.out.println(newDosen.nidn);
    newDosen.mengajar();
}

