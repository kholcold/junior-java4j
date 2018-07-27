package ru.job4j.bank;

import java.util.Objects;

public class User {
    /**
     * Имя.
     */
    private String name;
    /**
     * Паспорт.
     */
    private String passport;

    public User() {
    }

    /**
     * Конструктор.
     *
     * @param name     Имя.
     * @param passport Паспорт.
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Возврат имя.
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Возврат паспорт.
     *
     * @return
     */
    public String getPassport() {
        return passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, passport);
    }
}
