
import javax.swing.*;
import java.awt.event.*;

public class Latihanempat {
    public static void main(String[] args) {
 
        // Frame
        JFrame frame = new JFrame("Variasi Tombol");
        frame.setSize(420, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Label Input 1
        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);
 
        // Input 1
        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 150, 25);
        frame.add(input1);
 
        // Label Input 2
        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);
 
        // Input 2
        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 150, 25);
        frame.add(input2);
 
        // Output
        JTextField output = new JTextField();
        output.setBounds(20, 100, 280, 30);
        output.setEditable(false);
        frame.add(output);
 
        // ======================================================
        // VARIASI BUTTON
        // ======================================================
 
        // Tombol 1: TAMPILKAN
        JButton btnTampil = new JButton("Tampilkan");
        btnTampil.setBounds(20, 150, 120, 30);
        frame.add(btnTampil);
 
        // Tombol 2: HAPUS
        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(150, 150, 120, 30);
        frame.add(btnHapus);
 
        // Tombol 3: KOSONGKAN OUTPUT
        JButton btnKosong = new JButton("Kosongkan");
        btnKosong.setBounds(20, 190, 120, 30);
        frame.add(btnKosong);
 
        // Tombol 4: KELUAR
        JButton btnKeluar = new JButton("Keluar");
        btnKeluar.setBounds(150, 190, 120, 30);
        frame.add(btnKeluar);
 
        // ======================================================
        // EVENT HANDLER BUTTON
        // ======================================================
 
        // Tampilkan Input
        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1 = input1.getText();
                String a2 = input2.getText();
                output.setText("Input 1 = " + a1 + " | Input 2 = " + a2);
            }
        });
 
        // Hapus Input (mengosongkan text field input)
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.setText("");
                input2.setText("");
                output.setText("Input telah dihapus.");
            }
        });
 
        // Kosongkan Output
        btnKosong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                output.setText("");
            }
        });
 
        // Keluar dari Aplikasi
        btnKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
 
        frame.setVisible(true);
    }
}
