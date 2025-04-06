package Pertemuan5;

public class MatakuliahMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "AB", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);
        
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());
        
        double totalBobot = (mk1.nilaiIndex() * mk1.getSks()) + 
                            (mk2.nilaiIndex() * mk2.getSks()) + 
                            (mk3.nilaiIndex() * mk3.getSks());
        int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
        double ipk = totalBobot / totalSks;
        
        System.out.println("\n--- Nilai IPK ---");
        System.out.println("IPK: " + String.format("%.2f", ipk));
    }
}

// Latihan 2 + Latihan 3 //