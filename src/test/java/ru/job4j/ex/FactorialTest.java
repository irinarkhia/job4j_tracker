package ru.job4j.ex;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {

    @Test
    public void calcWhenNonCorrect() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Factorial.calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }

    @Test
    public void calcWhenCorrect() {
        int index = 3;
        int result = Factorial.calc(index);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}