package Pertemuan11;

public class Pesawat extends Kendaraan implements Terbang {
    void nyalakanMesin() {
        System.out.println("Mesin pesawat dinyalakan.");
    }
    
    public void terbang() {
        System.out.println("Pesawat sedang terbang di udara.");
    }
}
