package ru.job4j.io;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner input = new Scanner(System.in);
        String que = input.nextLine();
        int answer = new Random().nextInt(3);
        String ans;
        if (answer == 0) {
            ans = "Нет";
        } else if (answer == 1) {
            ans = "Да";
        } else {
            ans = "Может быть";
        }
        System.out.println(ans);
    }
}
