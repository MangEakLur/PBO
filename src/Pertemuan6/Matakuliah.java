package Pertemuan6;

public class Matakuliah {
    private String kode;
    private String nama;
    private String nilai;
    private int sks;
    
    public Matakuliah(String kode, String nama, String nilai, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.nilai = nilai;
        this.sks = sks;
    }
    
    public String display() {
        return kode + " - " + nama + " - " + nilai + " - " + sks;
    }
    
    public double getNilaiAngka() {
        switch (nilai) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }
    
    public int getSKS() {
        return sks;
    }
}
