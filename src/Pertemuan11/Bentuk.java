package Pertemuan11;

public abstract class Bentuk {
    abstract double luas();
}

class Lingkaran extends Bentuk {
    double r;
    
    Lingkaran(double r) {
        this.r = r;
    }
    
    double luas() {
        return Math.PI * r * r;
    }
}

class Tabung extends Bentuk {
    double r, t;
    
    Tabung(double r, double t) {
        this.r = r;
        this.t = t;
    }
    
    double luas() {
        return 2 * Math.PI * r * (r + t);
    }
}