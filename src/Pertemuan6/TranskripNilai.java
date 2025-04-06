package Pertemuan6;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;
    
    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date(0);
    }
    
    public Date getTglCetak() { return tglCetak; }
    public void setTglCetak(Date tglCetak) { this.tglCetak = tglCetak; }
    
    public double getIpk() { return ipk; }
    public void setIpk(double ipk) { this.ipk = ipk; }
    
    public List<KartuHasilStudi> getKartuHasilStudi() { return kartuHasilStudi; }
    
    public Mahasiswa getMahasiswa() { return mahasiswa; }
    public void setMahasiswa(Mahasiswa mahasiswa) { this.mahasiswa = mahasiswa; }
    
    public void hitungIPK() {
        double totalNilai = 0;
        int totalSKS = 0;
        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalNilai += mk.getNilaiAngka() * mk.getSKS();
                totalSKS += mk.getSKS();
            }
        }
        if (totalSKS > 0) {
            ipk = totalNilai / totalSKS;
        }
    }
    
    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }
    
    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }
}
