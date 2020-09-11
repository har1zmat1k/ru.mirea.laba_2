package ru.mirea.laba_2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(30, 15);
        System.out.println(b1);
        System.out.println("x = " + b1.getX() + ", y = " + b1.getY());
    }
}
