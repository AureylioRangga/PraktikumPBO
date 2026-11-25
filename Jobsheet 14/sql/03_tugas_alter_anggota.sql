-- Tugas D.2 (PostgreSQL): jalankan pada database db_perpus
-- CATATAN: kolom tanggal_daftar SUDAH ADA di CREATE TABLE latihan C,
-- jadi hanya email dan status yang perlu ditambahkan.
ALTER TABLE anggota ADD COLUMN email VARCHAR(100) NOT NULL DEFAULT '';
ALTER TABLE anggota ADD COLUMN status VARCHAR(20) NOT NULL DEFAULT 'aktif'
    CHECK (status IN ('aktif', 'tidak aktif'));

-- Cek struktur tabel (pengganti DESCRIBE di MySQL):
SELECT column_name, data_type, is_nullable, column_default
FROM information_schema.columns
WHERE table_name = 'anggota'
ORDER BY ordinal_position;

