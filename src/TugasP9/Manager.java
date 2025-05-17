package TugasP9;

public class Manager extends Pegawai {
    private String divisi;

    public Manager(String nama, double gaji, String divisi) {
        super(nama, gaji);
        this.divisi = divisi;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Divisi: " + divisi);
    }
}

