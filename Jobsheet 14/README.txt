KODE JOBSHEET JAVA GUI PART II - BE FE dan CRUD  (VERSI POSTGRESQL / DBEAVER)
==============================================================================
Isi:
  1_pbo-gui/       Latihan B  (Registrasi Member Gym, database db_gym)
  2_guidb/         Latihan C  (CRUD Perpustakaan, database db_perpus)
  3_guidb_tugas/   Tugas D    (validasi input + kolom email, tanggal_daftar, status)
  sql/             Skrip SQL PostgreSQL (sudah diuji di PostgreSQL 16)

Cara pakai:
  1. Pastikan PostgreSQL berjalan (port 5432). Di DBeaver buat koneksi: user postgres + password Anda.
  2. PostgreSQL tidak punya USE, jadi pembuatan database dilakukan 2 tahap:
       Latihan B : (a) SQL Editor database "postgres" -> jalankan sql/01a_create_database_db_gym.sql
                   (b) Refresh, buka SQL Editor database "db_gym" -> jalankan sql/01b_create_table_member_gym.sql
       Latihan C : (a) sql/02a_create_database_db_perpus.sql   (di database "postgres")
                   (b) sql/02b_create_table_anggota.sql        (di SQL Editor "db_perpus")
       Tugas     : sql/03_tugas_alter_anggota.sql              (di SQL Editor "db_perpus", setelah 02b)
     Jalankan file dengan Alt+X (Execute Script) di DBeaver.
  3. PASSWORD: ganti nilai "postgres" pada
       1_pbo-gui/.../backend/TestKoneksi.java   (variabel pass)
       2_guidb/.../backend/KoneksiDB.java       (variabel PASS)
       3_guidb_tugas/.../backend/KoneksiDB.java (variabel PASS)
     sesuai password PostgreSQL Anda.
  4. NetBeans: File > Open Project > pilih folder project > Clean and Build
     (Maven mengunduh driver org.postgresql:postgresql, perlu internet).
  5. Jalankan:
       1_pbo-gui      -> klik kanan frontend/FormRegistrasiGym.java > Run File
                         (uji koneksi: backend/TestKoneksi.java)
       2_guidb        -> klik kanan frontend/FormMemberPerpus.java > Run File
       3_guidb_tugas  -> klik kanan frontend/FormMemberPerpus.java > Run File

Perbedaan dari versi MySQL:
  AUTO_INCREMENT -> SERIAL | DEFAULT (CURRENT_DATE) -> DEFAULT CURRENT_DATE
  ENUM status -> VARCHAR(20) + CHECK | tanpa USE / DESCRIBE / AFTER
  Driver org.postgresql.Driver, URL jdbc:postgresql://localhost:5432/<db>, user postgres.

Catatan:
  - Kolom tanggal_daftar sudah ada sejak sql/02b; ALTER di tugas hanya menambah email dan status.
  - maven.compiler.source/target = 17. Ubah sesuai JDK Anda.
