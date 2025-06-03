package Pertemuan13;

public abstract class Bentuk {
    abstract void gambar();
    abstract void luas();
}

class Lingkaran extends Bentuk {
    void gambar() {
        System.out.println("Menggambar bentuk Lingkaran dengan jari-jari tertentu.");
    }
    void luas() {
    	System.out.println("--- Lingkaran ---");
    }
}

class Tabung extends Bentuk {
    void gambar() {
        System.out.println("Menggambar bentuk Tabung dengan tinggi dan jari-jari.");
    }
    void luas() {
    	System.out.println("--- Tabung ---");
    }
}