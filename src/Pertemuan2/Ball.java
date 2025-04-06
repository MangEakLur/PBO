package Pertemuan2;

public class Ball {
    private String color;
    private int size;
    private boolean moveStatus;

    // Constructuor
    public Ball(String color, int size, boolean moveStatus) {
        this.color = color;
        this.size = size;
        this.moveStatus = moveStatus;
    }

    public void move() {
        moveStatus = true;
        System.out.println("The ball is moving");
    }

    public void stop() {
        moveStatus = false;
        System.out.println("The ball has stopped");
    }

    public void status() {
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Move Status: " + moveStatus);
    }

    public void showStatus() {
        String status = setStatus();
        System.out.println("The ball currently is " + status + ".");
    }

    private String setStatus() {
        return moveStatus ? "Move" : "Stop";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void showColor() {
        System.out.println("The color of the ball is " + color + ".");
    }

    public void showSize() {
        System.out.println("The size of the ball is " + size + ".");
    }

}
