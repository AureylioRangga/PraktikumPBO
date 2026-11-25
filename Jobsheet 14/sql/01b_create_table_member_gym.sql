-- LANGKAH 2: di DBeaver, buat koneksi/aktifkan database db_gym
-- (klik kanan Databases > Refresh, lalu buka SQL Editor pada db_gym), kemudian jalankan:
CREATE TABLE member_gym (
    id    SERIAL PRIMARY KEY,
    nama  VARCHAR(100) NOT NULL,
    usia  INT NOT NULL,
    paket VARCHAR(50) NOT NULL
);
