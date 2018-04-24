package ru.job4j.profession;

/**
 * Class Student.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 24.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Student {
    public String name;

    /**
     * Возвращаем имя.
     *
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливаем имя.
     *
     * @param name установить имя.
     */
    public void setName(String name) {
        this.name = name;
    }
}
