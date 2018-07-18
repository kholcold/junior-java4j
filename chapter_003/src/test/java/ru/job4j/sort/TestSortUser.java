package ru.job4j.sort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    /**
     * По длине имени.
     */
    @Test
    public void whenSortingLenghtName() {
        List<User> users = new ArrayList<>();
        users.addAll(
                Arrays.asList(
                        new User("Vova", 30),
                        new User("Kot", 25),
                        new User("Alexandr", 31)
                )
        );
        SortUser sortUser = new SortUser();
        sortUser.sortNameLength(users);
        assertThat(users.get(0).getName().length(), is(3));
        assertThat(users.get(1).getName().length(), is(4));
        assertThat(users.get(2).getName().length(), is(8));

    }

    /**
     * По длине имени и возвраста.
     */
    @Test
    public void whenSortByNameAndAge() {
        List<User> users = new ArrayList<>();
        users.addAll(
                Arrays.asList(
                        new User("Vova", 30),
                        new User("Vova", 25),
                        new User("Alexandr", 31),
                        new User("Alexandr", 26)
                )
        );
        SortUser sortUser = new SortUser();
        sortUser.sortByAllFields(users);
        assertThat(users.get(0).getAge(), is(25));
        assertThat(users.get(1).getAge(), is(30));
        assertThat(users.get(2).getAge(), is(26));
        assertThat(users.get(3).getAge(), is(31));

    }
}
