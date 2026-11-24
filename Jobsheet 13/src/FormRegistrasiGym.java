import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class FormRegistrasiGym {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form Registrasi Member Gym");
        frame.setSize(420, 380);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNama = new JLabel("Nama Member:");
        lblNama.setBounds(20, 20, 120, 25);
        frame.add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setBounds(150, 20, 230, 25);
        frame.add(txtNama);

        JLabel lblUsia = new JLabel("Usia:");
        lblUsia.setBounds(20, 60, 120, 25);
        frame.add(lblUsia);

        JTextField txtUsia = new JTextField();
        txtUsia.setBounds(150, 60, 230, 25);
        frame.add(txtUsia);

        JLabel lblPaket = new JLabel("Paket Gym:");
        lblPaket.setBounds(20, 100, 120, 25);
        frame.add(lblPaket);

        String[] paketGym = {"Bulanan", "3 Bulan", "Tahunan"};
        JComboBox<String> cbPaket = new JComboBox<>(paketGym);
        cbPaket.setBounds(150, 100, 230, 25);
        frame.add(cbPaket);

        JButton btnSimpan = new JButton("Daftar Member");
        btnSimpan.setBounds(20, 150, 170, 30);
        frame.add(btnSimpan);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(210, 150, 170, 30);
        frame.add(btnReset);

        JTextArea areaHasil = new JTextArea();
        areaHasil.setBounds(20, 200, 360, 120);
        areaHasil.setEditable(false);
        frame.add(areaHasil);

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText().trim();
                String usiaStr = txtUsia.getText().trim();
                String paket = cbPaket.getSelectedItem().toString();

                if (nama.isEmpty() || usiaStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Nama dan usia wajib diisi!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int usia;
                try {
                    usia = Integer.parseInt(usiaStr);
                    if (usia <= 0) {
                        JOptionPane.showMessageDialog(frame,
                                "Usia harus lebih dari 0!",
                                "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Usia harus berupa angka!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String url = "jdbc:mariadb://localhost:3306/db_gym";
                String user = "root";
                String password = ""; // Sesuaikan dengan password MariaDB Anda.

                String sql = "INSERT INTO member_gym (nama, usia, paket) VALUES (?, ?, ?)";

                try (Connection conn = DriverManager.getConnection(url, user, password);
                     PreparedStatement stmt = conn.prepareStatement(sql)) {

                    stmt.setString(1, nama);
                    stmt.setInt(2, usia);
                    stmt.setString(3, paket);
                    stmt.executeUpdate();

                    areaHasil.setText("REGISTRASI BERHASIL:\n");
                    areaHasil.append("Nama: " + nama + "\n");
                    areaHasil.append("Usia: " + usia + "\n");
                    areaHasil.append("Paket: " + paket + "\n");

                    JOptionPane.showMessageDialog(frame,
                            "Member gym berhasil didaftarkan!",
                            "Sukses", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame,
                            "Gagal menyimpan ke database!\n" + ex.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNama.setText("");
                txtUsia.setText("");
                cbPaket.setSelectedIndex(0);
                areaHasil.setText("");
            }
        });

        frame.setVisible(true);
    }
}
