package frontend;

import backend.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class FormMemberPerpus extends JFrame {

    private JTextField txtNama, txtAlamat, txtHp, txtEmail, txtTanggal;
    private JComboBox<String> cmbJenis, cmbStatus;
    private JTable table;
    private DefaultTableModel model;
    private int idSelected = -1;

    public FormMemberPerpus() {
        setTitle("Form Anggota Perpustakaan");
        setSize(900, 560);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        loadData();
    }

    private void initComponents() {
        JLabel lblNama = new JLabel("Nama");
        JLabel lblAlamat = new JLabel("Alamat");
        JLabel lblHp = new JLabel("No HP");
        JLabel lblEmail = new JLabel("Email");
        JLabel lblJenis = new JLabel("Jenis Member");
        JLabel lblTanggal = new JLabel("Tanggal Daftar (yyyy-MM-dd)");
        JLabel lblStatus = new JLabel("Status");

        txtNama = new JTextField();
        txtAlamat = new JTextField();
        txtHp = new JTextField();
        txtEmail = new JTextField();
        txtTanggal = new JTextField(LocalDate.now().toString());
        cmbJenis = new JComboBox<>(new String[]{"Reguler", "Premium", "VIP"});
        cmbStatus = new JComboBox<>(new String[]{"aktif", "tidak aktif"});

        JButton btnSimpan = new JButton("Simpan");
        JButton btnUpdate = new JButton("Update");
        JButton btnHapus = new JButton("Hapus");
        JButton btnReset = new JButton("Reset");

        btnSimpan.addActionListener(e -> simpan());
        btnUpdate.addActionListener(e -> update());
        btnHapus.addActionListener(e -> hapus());
        btnReset.addActionListener(e -> resetForm());

        model = new DefaultTableModel(new String[]{"ID", "Nama", "Alamat", "No HP", "Email",
                "Jenis", "Tgl Daftar", "Status"}, 0);
        table = new JTable(model);

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
                isiForm();
            }
        });

        JPanel form = new JPanel(new GridLayout(7, 2, 10, 10));
        form.add(lblNama); form.add(txtNama);
        form.add(lblAlamat); form.add(txtAlamat);
        form.add(lblHp); form.add(txtHp);
        form.add(lblEmail); form.add(txtEmail);
        form.add(lblJenis); form.add(cmbJenis);
        form.add(lblTanggal); form.add(txtTanggal);
        form.add(lblStatus); form.add(cmbStatus);

        JPanel tombol = new JPanel();
        tombol.add(btnSimpan);
        tombol.add(btnUpdate);
        tombol.add(btnHapus);
        tombol.add(btnReset);

        add(form, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(tombol, BorderLayout.SOUTH);
    }

    // ================= VALIDASI INPUT (Tugas D.1) =================
    // Mengembalikan true jika semua input valid; jika tidak, tampilkan JOptionPane.
    private boolean validasiInput() {
        String nama = txtNama.getText().trim();
        String alamat = txtAlamat.getText().trim();
        String hp = txtHp.getText().trim();
        String email = txtEmail.getText().trim();
        String tanggal = txtTanggal.getText().trim();

        // 1. Nama tidak boleh kosong
        if (nama.isEmpty()) {
            tampilError("Nama tidak boleh kosong!");
            txtNama.requestFocus();
            return false;
        }

        // 2. Alamat minimal 10 karakter
        if (alamat.length() < 10) {
            tampilError("Alamat minimal 10 karakter!");
            txtAlamat.requestFocus();
            return false;
        }

        // 3. No HP harus angka
        if (hp.isEmpty() || !hp.matches("\\d+")) {
            tampilError("No HP harus berupa angka!");
            txtHp.requestFocus();
            return false;
        }

        // Tambahan: format email sederhana
        if (!email.matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$")) {
            tampilError("Format email tidak valid! Contoh: nama@email.com");
            txtEmail.requestFocus();
            return false;
        }

        // Tambahan: format tanggal yyyy-MM-dd
        try {
            LocalDate.parse(tanggal);
        } catch (Exception ex) {
            tampilError("Format tanggal harus yyyy-MM-dd! Contoh: 2025-11-25");
            txtTanggal.requestFocus();
            return false;
        }

        return true;
    }

    private void tampilError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Validasi Gagal", JOptionPane.ERROR_MESSAGE);
    }

    // LOAD DATA KE TABEL
    private void loadData() {
        model.setRowCount(0);
        ArrayList<Member> list = MemberController.getAll();
        for (Member m : list) {
            model.addRow(new Object[]{
                m.getId(), m.getNama(), m.getAlamat(), m.getNoHp(), m.getEmail(),
                m.getJenisMember(), m.getTanggalDaftar(), m.getStatus()
            });
        }
    }

    // SIMPAN
    private void simpan() {
        if (!validasiInput()) return;

        Member m = new Member(
                txtNama.getText().trim(),
                txtAlamat.getText().trim(),
                txtHp.getText().trim(),
                txtEmail.getText().trim(),
                cmbJenis.getSelectedItem().toString(),
                txtTanggal.getText().trim(),
                cmbStatus.getSelectedItem().toString()
        );

        if (MemberController.tambah(m)) {
            JOptionPane.showMessageDialog(this, "Berhasil disimpan");
            loadData();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // UPDATE
    private void update() {
        if (idSelected == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data dulu");
            return;
        }
        if (!validasiInput()) return;

        Member m = new Member(idSelected,
                txtNama.getText().trim(),
                txtAlamat.getText().trim(),
                txtHp.getText().trim(),
                txtEmail.getText().trim(),
                cmbJenis.getSelectedItem().toString(),
                txtTanggal.getText().trim(),
                cmbStatus.getSelectedItem().toString()
        );

        if (MemberController.update(m)) {
            JOptionPane.showMessageDialog(this, "Berhasil diupdate");
            loadData();
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Gagal mengupdate data!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // HAPUS
    private void hapus() {
        if (idSelected == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data dulu");
            return;
        }

        if (MemberController.delete(idSelected)) {
            JOptionPane.showMessageDialog(this, "Berhasil dihapus");
            loadData();
            resetForm();
        }
    }

    // AMBIL DATA KE FORM
    private void isiForm() {
        int row = table.getSelectedRow();
        idSelected = Integer.parseInt(model.getValueAt(row, 0).toString());
        txtNama.setText(model.getValueAt(row, 1).toString());
        txtAlamat.setText(model.getValueAt(row, 2).toString());
        txtHp.setText(model.getValueAt(row, 3).toString());
        txtEmail.setText(model.getValueAt(row, 4).toString());
        cmbJenis.setSelectedItem(model.getValueAt(row, 5).toString());
        txtTanggal.setText(model.getValueAt(row, 6).toString());
        cmbStatus.setSelectedItem(model.getValueAt(row, 7).toString());
    }

    // RESET FORM
    private void resetForm() {
        txtNama.setText("");
        txtAlamat.setText("");
        txtHp.setText("");
        txtEmail.setText("");
        txtTanggal.setText(LocalDate.now().toString());
        cmbJenis.setSelectedIndex(0);
        cmbStatus.setSelectedIndex(0);
        idSelected = -1;
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormMemberPerpus().setVisible(true));
    }
}
