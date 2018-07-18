package ru.job4j.sort;

import java.util.*;

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
     *
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

    /**
     * В этом методе необходимо определить Comparator для метода Collections.sort
     * и отсортировать List<User> по длине имени.
     *
     * @param list List<User>
     * @return Отсортированый List<User>
     */
    public List<User> sortNameLength(List<User> list) {
        Collections.sort(
                list,
                new Comparator<User>() {
                    @Override
                    public int compare(User userOne, User userTwo) {
                        Integer sizeNameOne = userOne.getName().length();
                        Integer sizeNameTwo = userTwo.getName().length();
                        return userOne.compareTo(userTwo);
                    }
                }
        );
        return list;
    }

    /**
     * в этом методе необходимо определить Comparator для метода Collections.sort и отсортировать List<User>
     * по обоим полям, сначала сортировка по имени в лексикографическом порядке, потом по возрасту.
     *
     * @param list List<User>
     * @return Отсортированый List<User>.
     */
    public List<User> sortByAllFields(List<User> list) {
        Collections.sort(
                list,
                new Comparator<User>() {
                    @Override
                    public int compare(User userOne, User userTwo) {
                        int name = Integer.compare(userOne.getName().length(), userTwo.getName().length());
                        return name == 0 ? userOne.getAge().compareTo(userTwo.getAge()) : name;
                    }
                }
        );
        return list;
    }
}
