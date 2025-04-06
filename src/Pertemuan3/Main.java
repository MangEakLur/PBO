package Pertemuan3;

public class Main {
    public static void main(String[] args) {
        Orang o1 = new Orang("233040091", "Iqbal", "Soreang");
        Orang o2 = new Orang("233040111", "Dimas", "Sadu");
        Orang o3 = new Orang("233040999", "Amira", "Bandung");

        System.out.println(o1.Hadir);

        Lingkaran L = new Lingkaran(4);

        System.out.println(L.HitungLuas());
    }
}
