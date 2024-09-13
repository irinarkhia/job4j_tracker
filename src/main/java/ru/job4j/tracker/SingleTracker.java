package ru.job4j.tracker;

public class SingleTracker {

    private static Tracker tracker = new Tracker();

    private SingleTracker() { }

    public static Item add(Item item) {
        return tracker.add(item);
    }

    public static Item[] findAll() {
        return tracker.findAll();
    }

    public static Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public static Item findById(int id) {
        return tracker.findById(id);
    }

    public static boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public static void delete(int id) { }
}
