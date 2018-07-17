package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс SortUser.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 17.07.18.
 * @version 1.0.
 * @since 0.1.
 */
public class SortUser {
    /**
     * Метод sort.
     * @param list list.
     * @return Set<User>.
     */
    public Set<User> sort(List<User> list) {
        Set<User> users = new TreeSet<>();
        for (User user : list) {
            users.add(user);
        }

        return users;
    }
}
