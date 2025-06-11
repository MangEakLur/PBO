package Pertemuan15;
// Latihan 1-2 //
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
    public HelloWorldForm2() {
        JLabel label = new JLabel("Hello World!");
        add(label);

        setTitle("Form Hello World");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
