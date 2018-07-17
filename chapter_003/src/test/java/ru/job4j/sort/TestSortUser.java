package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс тест TestSortUser
 */
public class TestSortUser {
    @Test
    public void whenFirstUserGreaterThanSecondUser() {
        assertThat(new User("Alex", 35).compareTo(new User("Vova", 25)), is(1));
    }

    @Test
    public void whenFirstUserIsLessThanTheSecondUser() {
        assertThat(new User("Alex", 25).compareTo(new User("Vova", 35)), is(-1));
    }

    @Test
    public void whenFirstUserIsEqualToTheSecondUser() {
        assertThat(new User("Alex", 25).compareTo(new User("Vova", 25)), is(0));
    }
}
