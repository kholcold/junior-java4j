package ru.job4j.sort;

/**
 * Класс User.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 17.07.18.
 * @version 1.0.
 * @since 0.1.
 */
public class User implements Comparable<User> {
    /**
     * Имя.
     */
    private String name;
    /**
     * Возвраст.
     */
    private int age;

    /**
     * Конструктор.
     *
     * @param name Имя.
     * @param age  Возвраст.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Геттер для имени.
     *
     * @return Имя.
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер для возвраста.
     *
     * @return Возвраст.
     */
    public int getAge() {
        return age;
    }

    /**
     * Переопределенный метод compareTo который сравнивает текущий объект
     * с объектом, переданным в качестве параметра.
     *
     * @param o User user.
     * @return rsl.
     */
    @Override
    public int compareTo(User o) {
        int result;
        if (this.age > o.getAge())
            result = 1;
        else if (this.age < o.getAge())
            result = -1;
        else
            result = 0;

        return result;
    }
}
