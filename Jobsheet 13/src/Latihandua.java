
import javax.swing.*;
import java.awt.event.*;

public class Latihandua {
    public static void main(String[] args) {
 
        // Membuat JFrame
        JFrame frame = new JFrame("Contoh JLabel");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // JLabel petunjuk
        JLabel label = new JLabel("Masukkan Angka:");
        label.setBounds(20, 20, 120, 25);
        frame.add(label);
 
        // TextField input
        JTextField textField = new JTextField();
        textField.setBounds(150, 20, 120, 25);
        frame.add(textField);
 
        // Tombol untuk menampilkan hasil
        JButton btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(20, 60, 120, 30);
        frame.add(btnTampil);
 
        // Label hasil
        JLabel lblHasil = new JLabel("Hasil: -");
        lblHasil.setBounds(150, 60, 150, 30);
        frame.add(lblHasil);
 
        // Event tombol
        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText(); // ambil isi input
                lblHasil.setText("Hasil: " + input); // tampilkan hasil
            }
        });
 
        frame.setVisible(true);
    }
}
