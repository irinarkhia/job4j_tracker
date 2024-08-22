package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item1 = new Item();
        System.out.println("Текущие дата и время после форматирования: " + item1.toString());
    }
}
