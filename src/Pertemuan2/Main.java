package Pertemuan2;

public class Main {
    public static void main(String[] args) {

        Ball ball1 = new Ball("Red", 20, false);
        Ball ball2 = new Ball("Blue", 20, false);

        ball1.move();

        ball1.showStatus();
        ball1.showColor();
        ball1.showSize();

        ball1.stop();

        ball1.showStatus();
    }
}