
import javax.swing.*;
import java.awt.event.*;

public class Latihantiga {
    public static void main(String[] args) {
 
        // Frame
        JFrame frame = new JFrame("Dua Input TextField");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Label Input 1
        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(20, 20, 120, 25);
        frame.add(label1);
 
        // TextField Input 1
        JTextField input1 = new JTextField();
        input1.setBounds(150, 20, 120, 25);
        frame.add(input1);
 
        // Label Input 2
        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(20, 60, 120, 25);
        frame.add(label2);
 
        // TextField Input 2
        JTextField input2 = new JTextField();
        input2.setBounds(150, 60, 120, 25);
        frame.add(input2);
 
        // Tombol
        JButton tombol = new JButton("Tampilkan");
        tombol.setBounds(20, 100, 120, 30);
        frame.add(tombol);
 
        // TextField Output
        JTextField output = new JTextField();
        output.setBounds(150, 100, 180, 30);
        output.setEditable(false); // tidak bisa diedit
        frame.add(output);
 
        // Event tombol
        tombol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka1 = input1.getText(); // ambil input 1
                String angka2 = input2.getText(); // ambil input 2
 
                // tampilkan gabungan keduanya
                output.setText("Input 1: " + angka1 + " | Input 2: " + angka2);
            }
        });
 
        frame.setVisible(true);
    }
}
