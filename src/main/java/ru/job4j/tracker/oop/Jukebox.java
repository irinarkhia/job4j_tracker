package ru.job4j.tracker.oop;

public class Jukebox {
    public void music(int position) {
        String first = "Пусть бегут неуклюже";
        String second = "Спокойной ночи";
        String third = "Песня не найдена";
        switch (position) {
            case 1:
                System.out.println(first);
                break;
            case 2:
                System.out.println(second);
            default:
                System.out.println(third);
        }
    }
    public static void main(String[] args) {
        Jukebox box = new Jukebox();
        box.music(1);
    }
}
