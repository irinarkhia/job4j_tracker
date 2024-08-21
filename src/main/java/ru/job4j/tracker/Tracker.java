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

    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                result = i;
                break;
            }
        }
        return result;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean res = false;
        int index1 = indexOf(id);
        if (index1 > -1) {
            item.setId(id);
            items[index1] = item;
            res = true;
        }
        return res;
    }
}