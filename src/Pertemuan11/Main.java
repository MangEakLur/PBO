package Pertemuan11;

public class Main {
	public static void main(String[] args) {
        Bentuk lingkaran = new Lingkaran(7);
        Bentuk tabung = new Tabung(7, 10);
        
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Tabung: " + tabung.luas());
    }
}
