package ru.job4j.user;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Класс тест.
 * @author Alexandr Kholodov.
 */
public class UserConvertTest {
    @Test
    public void whenListInMap() {
        User alex = new User(1, "Alexandr", "Yeisk");
        User vova = new User(2, "Vladimir", "Stavropol");
        UserConvert userConvert = new UserConvert();
        HashMap<Integer, User> result = new HashMap<>();
        result.put(1, alex);
        result.put(2, vova);
        List<User> users = new ArrayList<>();
        users.add(alex);
        users.add(vova);
        assertThat(result, is(userConvert.process(users)));
    }
}
