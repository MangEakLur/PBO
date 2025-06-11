package Pertemuan15;
// Latihan 2-1 //
import javax.swing.*;
import java.awt.event.*;

public class PenjumlahanForm extends JFrame implements ActionListener {
    private JTextField tfAngka1, tfAngka2;
    private JButton btnJumlah;

    public PenjumlahanForm() {
        tfAngka1 = new JTextField(5);
        tfAngka2 = new JTextField(5);
        btnJumlah = new JButton("Jumlahkan");

        setLayout(new java.awt.FlowLayout());
        add(new JLabel("Angka 1:"));
        add(tfAngka1);
        add(new JLabel("Angka 2:"));
        add(tfAngka2);
        add(btnJumlah);

        btnJumlah.addActionListener(this);

        setTitle("Penjumlahan Dua Angka");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(tfAngka1.getText());
            int angka2 = Integer.parseInt(tfAngka2.getText());
            int hasil = angka1 + angka2;
            JOptionPane.showMessageDialog(this, "Hasil: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        PenjumlahanForm form = new PenjumlahanForm();
        form.setVisible(true);
    }
}

