JOBSHEET JAVA GUI PART 1 - PROJECT VS CODE

Kebutuhan:
- JDK 20 (atau JDK kompatibel yang terpasang)
- VS Code + Extension Pack for Java
- Maven (VS Code dapat mengimpor project Maven)
- MySQL Server aktif untuk FormRegistrasiGym

Struktur:
- src/                  semua file Java
- pom.xml               konfigurasi Maven dan MySQL Connector/J 8.2.0
- database_db_gym.sql   pembuatan database dan tabel

Menjalankan latihan A sampai D:
1. Buka folder hasil ekstrak ZIP di VS Code.
2. Buka salah satu file pada folder src.
3. Klik Run di atas method main.
4. Jalankan satu file pada satu waktu.

Menjalankan FormRegistrasiGym:
1. Jalankan database_db_gym.sql pada MySQL/phpMyAdmin/DBeaver.
2. Pastikan database db_gym dan tabel member_gym sudah terbentuk.
3. Periksa URL, username, dan password MySQL di FormRegistrasiGym.java.
   Default di contoh: localhost:3306, user root, password kosong.
4. Pastikan Maven sudah mengunduh dependency mysql-connector-j.
5. Buka FormRegistrasiGym.java lalu klik Run.

Catatan:
- Kode dibuat tanpa package agar mudah dijalankan langsung dari folder src di VS Code.
- Bagian Registrasi.java menampilkan data pada form, belum menyimpan ke database.
- Bagian FormRegistrasiGym.java menyimpan data ke MySQL.
