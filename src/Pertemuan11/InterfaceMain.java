package Pertemuan11;

public class InterfaceMain {
    public static void main(String[] args) {
        Kartu kartu = new KartuElektronik();
        kartu.otentikasi("12345");
        kartu.encode("Saldo: 100000");
    }
}
