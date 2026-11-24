

import javax.swing.*;
import java.awt.event.*;

public class Registrasi {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Form Registrasi Mahasiswa");
        frame.setSize(400, 450);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label Nama
        JLabel lblNama = new JLabel("Nama:");
        lblNama.setBounds(20, 20, 100, 25);
        frame.add(lblNama);

        // Input Nama
        JTextField txtNama = new JTextField();
        txtNama.setBounds(130, 20, 200, 25);
        frame.add(txtNama);

        // Label NIM
        JLabel lblNim = new JLabel("NIM:");
        lblNim.setBounds(20, 60, 100, 25);
        frame.add(lblNim);

        // Input NIM
        JTextField txtNim = new JTextField();
        txtNim.setBounds(130, 60, 200, 25);
        frame.add(txtNim);

        // Label Prodi
        JLabel lblProdi = new JLabel("Prodi:");
        lblProdi.setBounds(20, 100, 100, 25);
        frame.add(lblProdi);

        // Input Prodi
        JTextField txtProdi = new JTextField();
        txtProdi.setBounds(130, 100, 200, 25);
        frame.add(txtProdi);

        // ===== TAMBAHAN (Langkah 5): Alamat =====
        // Label Alamat
        JLabel lblAlamat = new JLabel("Alamat:");
        lblAlamat.setBounds(20, 140, 100, 25);
        frame.add(lblAlamat);

        // Input Alamat
        JTextField txtAlamat = new JTextField();
        txtAlamat.setBounds(130, 140, 200, 25);
        frame.add(txtAlamat);

        // ===== TAMBAHAN (Langkah 5): Asal Sekolah =====
        // Label Asal Sekolah
        JLabel lblSekolah = new JLabel("Asal Sekolah:");
        lblSekolah.setBounds(20, 180, 100, 25);
        frame.add(lblSekolah);

        // Input Asal Sekolah
        JTextField txtSekolah = new JTextField();
        txtSekolah.setBounds(130, 180, 200, 25);
        frame.add(txtSekolah);

        // Tombol Simpan (digeser ke bawah)
        JButton btnSimpan = new JButton("Simpan");
        btnSimpan.setBounds(20, 230, 140, 30);
        frame.add(btnSimpan);

        // Tombol Reset (digeser ke bawah)
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(190, 230, 140, 30);
        frame.add(btnReset);

        // TextArea untuk menampilkan hasil (digeser ke bawah)
        JTextArea areaHasil = new JTextArea();
        areaHasil.setBounds(20, 280, 330, 120);
        areaHasil.setEditable(false);
        frame.add(areaHasil);

        // EVENT : Simpan data
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String nim = txtNim.getText().trim();
                String prodi = txtProdi.getText().trim();
                String alamat = txtAlamat.getText().trim();
                String sekolah = txtSekolah.getText().trim();

                // VALIDASI INPUT KOSONG (termasuk alamat dan asal sekolah)
                if (nama.isEmpty() || nim.isEmpty() || prodi.isEmpty()
                        || alamat.isEmpty() || sekolah.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Semua field harus diisi!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Jika valid: tampilkan data
                areaHasil.setText("Data Berhasil Disimpan:\n");
                areaHasil.append("Nama : " + nama + "\n");
                areaHasil.append("NIM : " + nim + "\n");
                areaHasil.append("Prodi : " + prodi + "\n");
                areaHasil.append("Alamat : " + alamat + "\n");
                areaHasil.append("Asal Sekolah : " + sekolah + "\n");

                JOptionPane.showMessageDialog(frame,
                        "Data berhasil disimpan!",
                        "Sukses",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // EVENT : Reset form
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtNim.setText("");
                txtProdi.setText("");
                txtAlamat.setText("");
                txtSekolah.setText("");
                areaHasil.setText("");
            }
        });

        frame.setVisible(true);
    }
}