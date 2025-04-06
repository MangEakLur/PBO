package Pertemuan5;

public class Matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    
    public Matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }
    
    public double nilaiIndex() {
        return switch (index) {
            case "A" -> 4.0;
            case "AB" -> 3.5;
            case "B" -> 3.0;
            case "BC" -> 2.5;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
    }
    
    public int getSks() {
        return sks;
    }
    
    public String display() {
        return kode + " - " + nama + " - " + index;
    }
}

// latihan 2 + Latihan 3 //