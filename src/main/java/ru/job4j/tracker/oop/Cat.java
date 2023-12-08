package ru.job4j.tracker.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }
    public String sound() {
        return "may-may";
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Nick");
        gav.eat("kotleta");
        gav.show();
    }
}
