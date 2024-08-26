package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            /* Остальная логика игры. */
            if (0 < matches && matches < 4) {
                if (count >= matches) {
                    count = count - matches;
                    System.out.println("Осталось спичек " + count);
                    if (count == 0) {
                        break;
                    }
                }
            } else {
                System.out.println(player + ", число должно быть от 1 до 3 и не более "  + count + ". Введите еще раз корректно.");
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
