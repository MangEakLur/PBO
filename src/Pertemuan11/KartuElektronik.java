package Pertemuan11;

public class KartuElektronik implements Kartu {
    public void otentikasi(String kode) {
        System.out.println("Kode " + kode + " telah diautentikasi.");
    }
    
    public void encode(String data) {
        System.out.println("Data " + data + " telah diencode.");
    }
}

