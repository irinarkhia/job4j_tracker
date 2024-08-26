package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("вперед до 80км/ч");
    }

    @Override
    public void passengers(int count) {
        System.out.println("до 50 человек");
    }

    @Override
    public int refuel(int fuel) {
        return 0;
    }
}
