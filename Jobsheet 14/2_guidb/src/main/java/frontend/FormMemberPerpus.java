package frontend;

import backend.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class FormMemberPerpus extends JFrame {

    private JTextField txtNama, txtAlamat, txtHp;
    private JComboBox<String> cmbJenis;
    private JTable table;
    private DefaultTableModel model;
    private int idSelected = -1;

    public FormMemberPerpus() {
        setTitle("Form Anggota Perpustakaan");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        loadData();
    }

    private void initComponents() {
        JLabel lblNama = new JLabel("Nama");
        JLabel lblAlamat = new JLabel("Alamat");
        JLabel lblHp = new JLabel("No HP");
        JLabel lblJenis = new JLabel("Jenis Member");

        txtNama = new JTextField();
        txtAlamat = new JTextField();
        txtHp = new JTextField();
        cmbJenis = new JComboBox<>(new String[]{"Reguler", "Premium", "VIP"});

        JButton btnSimpan = new JButton("Simpan");
        JButton btnUpdate = new JButton("Update");
        JButton btnHapus = new JButton("Hapus");
        JButton btnReset = new JButton("Reset");

        btnSimpan.addActionListener(e -> simpan());
        btnUpdate.addActionListener(e -> update());
        btnHapus.addActionListener(e -> hapus());
        btnReset.addActionListener(e -> resetForm());

        model = new DefaultTableModel(new String[]{"ID", "Nama", "Alamat", "No HP", "Jenis"}, 0);
        table = new JTable(model);

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {
                isiForm();
            }
        });

        JPanel form = new JPanel(new GridLayout(5, 2, 10, 10));
        form.add(lblNama); form.add(txtNama);
        form.add(lblAlamat); form.add(txtAlamat);
        form.add(lblHp); form.add(txtHp);
        form.add(lblJenis); form.add(cmbJenis);

        JPanel tombol = new JPanel();
        tombol.add(btnSimpan);
        tombol.add(btnUpdate);
        tombol.add(btnHapus);
        tombol.add(btnReset);

        add(form, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(tombol, BorderLayout.SOUTH);
    }

    // LOAD DATA KE TABEL
    private void loadData() {
        model.setRowCount(0);
        ArrayList<Member> list = MemberController.getAll();
        for (Member m : list) {
            model.addRow(new Object[]{
                m.getId(), m.getNama(), m.getAlamat(), m.getNoHp(), m.getJenisMember()
            });
        }
    }

    // SIMPAN
    private void simpan() {
        Member m = new Member(
                txtNama.getText(),
                txtAlamat.getText(),
                txtHp.getText(),
                cmbJenis.getSelectedItem().toString()
        );

        if (MemberController.tambah(m)) {
            JOptionPane.showMessageDialog(this, "Berhasil disimpan");
            loadData();
            resetForm();
        }
    }

    // UPDATE
    private void update() {
        if (idSelected == -1) {
            JOptionPane.showMessageDialog(this, "Pilih data dulu");
            return;
        }

        Member m = new Member(idSelected,
                txtNama.getText(),
                txtAlamat.getText(),
                txtHp.getText(),
                cmbJenis.getSelectedItem().toString()
        );

        if (MemberController.update(m)) {
            JOptionPane.showMessageDialog(this, "Berhasil diupdate");
            loadData();
            resetForm();
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
        cmbJenis.setSelectedItem(model.getValueAt(row, 4).toString());
    }

    // RESET FORM
    private void resetForm() {
        txtNama.setText("");
        txtAlamat.setText("");
        txtHp.setText("");
        cmbJenis.setSelectedIndex(0);
        idSelected = -1;
        table.clearSelection();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FormMemberPerpus().setVisible(true));
    }
}
