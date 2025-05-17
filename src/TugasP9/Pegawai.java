package TugasP9;

public class Pegawai {
    protected String nama;
    protected double gaji;

    public Pegawai(String nama, double gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji: Rp " + gaji);
    }
}