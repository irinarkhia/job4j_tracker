package ru.job4j.tracker;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StartUITest {

    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    @Test
    void findItemByName() {
    }

    @Test
    void findItemById() {
    }

    @Test
    void deleteItem() {
    }

    @Test
    void replaceItem() {
    }

    @Test
    void findAllItems() {
    }

    @Test
    void main() {
    }
}