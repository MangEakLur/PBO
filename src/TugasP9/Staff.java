package TugasP9;

public class Staff extends Pegawai {
    private int jamLembur;

    public Staff(String nama, double gaji, int jamLembur) {
        super(nama, gaji);
        this.jamLembur = jamLembur;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Jam Lembur: " + jamLembur + " jam");
    }
}
