package ru.job4j.tracker;

public final class SingleTracker {

    private static Tracker tracker = new Tracker();

    private static SingleTracker singleTracker = null;

    private SingleTracker() { }

    private static SingleTracker getInstance(){
        if (singleTracker == null) {
            singleTracker = new SingleTracker();
        }
        return singleTracker;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public static void delete(int id) { }
}
