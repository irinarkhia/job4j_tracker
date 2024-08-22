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
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int newSize = 0;
        Item[] itemsWithTrueName = new Item[findAll().length];
        for (int i = 0; i < itemsWithTrueName.length; i++) {
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

    public void delete(int id) {
        int foundInd = indexOf(id);
        if (foundInd != -1) {
            items[foundInd] = null;
            System.arraycopy(items, foundInd + 1, items, foundInd, size - foundInd - 1);
            items[size - 1] = null;
            size--;
        }
    }
}