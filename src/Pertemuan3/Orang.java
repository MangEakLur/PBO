package Pertemuan3;

public class Orang {
    public String NPM;
    public String Nama;
    public String Alamat;
    public boolean Hadir;

    public Orang(String NPM, String Nama, String Alamat) {
        this.NPM = NPM;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public void Absensi() {
        this.Hadir = true;
    }
}