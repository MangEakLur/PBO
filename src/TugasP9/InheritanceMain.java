package TugasP9;

public class InheritanceMain {
    public static void main(String[] args) {
        Manager m = new Manager("Andi", 1000000, "Keuangan");
        Staff s = new Staff("Budi", 5000000, 10);

        System.out.println("=== Data Manager ===");
        m.tampilInfo();

        System.out.println("\n=== Data Staff ===");
        s.tampilInfo();
    }
}

