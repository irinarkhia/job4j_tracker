package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    //- ввод отрицательного числа - тут все просто, поместите отрицательное число в виде строки в массив, для валидатора такое значение валидное и метод вернет это отрицательное число.
    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Показать все заявки");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenManyValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"0", "4", "5"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Показать все заявки");
        assertThat(selected).isEqualTo(0);
        int selected1 = input.askInt("Показать все заявки");
        assertThat(selected1).isEqualTo(4);
        int selected2 = input.askInt("Показать все заявки");
        assertThat(selected2).isEqualTo(5);
    }

    @Test
    void whenMinusValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Показать все заявки");
        assertThat(selected).isEqualTo(-1);
    }
}