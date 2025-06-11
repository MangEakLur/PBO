package Pertemuan15;
// Latihan 1-3 //
import javax.swing.*;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public HelloWorldForm3() {
        label = new JLabel("Hello World!");
        button = new JButton("Klik Saya");

        add(label);
        add(button);

        button.addActionListener(this);

        setLayout(new java.awt.FlowLayout());
        setTitle("Form dengan Button");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Tombol telah diklik!");
    }

    public static void main(String[] args) {
        HelloWorldForm3 form = new HelloWorldForm3();
        form.setVisible(true);
    }
}
