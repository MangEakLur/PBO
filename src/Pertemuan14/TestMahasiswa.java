package Pertemuan14;

//File: TestMahasiswa.java
public class TestMahasiswa {
 public static void main(String[] args) {
     Mahasiswa m1 = new Mahasiswa("2023001", "Ayu");
     Mahasiswa m2 = new Mahasiswa("2023002", "Budi");

     m1.displayInfo();
     System.out.println("------------------");
     m2.displayInfo();

     System.out.println("==================");
     System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
 }
}
