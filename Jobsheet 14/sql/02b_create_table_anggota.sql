-- LANGKAH 2: buka SQL Editor pada database db_perpus, lalu jalankan:
CREATE TABLE anggota (
    id SERIAL PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    alamat VARCHAR(200) NOT NULL,
    no_hp VARCHAR(20) NOT NULL,
    jenis_member VARCHAR(50) NOT NULL,
    tanggal_daftar DATE NOT NULL DEFAULT CURRENT_DATE
);
