package ru.job4j.tracker;

import java.util.Arrays;

public class SingleTracker {

    private Tracker tracker = new Tracker();

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public int indexOf(int id) {
        return tracker.indexOf(id);
    }

    public Item findById(int id) {
        return tracker.findById(indexOf(id));
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public void delete(int id) { }
}
