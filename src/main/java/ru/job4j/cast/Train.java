package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("едет по железной дороге");
    }
}
