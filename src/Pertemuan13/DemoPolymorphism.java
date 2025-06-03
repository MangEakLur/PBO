package Pertemuan13;

public class DemoPolymorphism {
    public static void main(String[] args) {
        // Array of superclass type
        Bentuk[] daftarBentuk = new Bentuk[2];
        daftarBentuk[0] = new Lingkaran(); // upcasting
        daftarBentuk[1] = new Tabung();    // upcasting

        // Pemanggilan method gambar secara polymorphic
        for (Bentuk b : daftarBentuk) {
        	b.luas();
        	b.gambar(); // Akan memanggil method sesuai dengan objek aslinya
        }
    }
}


