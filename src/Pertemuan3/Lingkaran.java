package Pertemuan3;

public class Lingkaran {
    private double Jari;
    private final double Phi = 3.14;

    public Lingkaran(float Jari) {
        this.Jari = Jari;
    }

    public double HitungLuas() {
        return Jari * Jari * Phi;
    }
}

