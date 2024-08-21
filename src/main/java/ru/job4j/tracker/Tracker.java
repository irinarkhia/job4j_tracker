package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item o = null;
        for (int i = 0; i < items.length; i++) {
            int itemNumber = items[i].getId();
            if (itemNumber == id) {
                o = items[i];
                break;
            }
        }
        return o;
    }

    public Item[] findAll() {
        Item[] itemsWithoutNull = new Item[items.length];
        int mySize = 0;
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            if (item != null) {
                itemsWithoutNull[mySize] = item;
                mySize++;
            }
        }
        itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, mySize);
        return itemsWithoutNull;
    }

    public Item[] findByName(String key) {
        int newSize = 0;
        Item[] itemsWithTrueName = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item o = items[i];
            if (o != null && o.getName().equals(key)) {
                itemsWithTrueName[newSize] = o;
                newSize++;
            }
        }
        itemsWithTrueName = Arrays.copyOf(itemsWithTrueName, newSize);
        return itemsWithTrueName;
    }
}