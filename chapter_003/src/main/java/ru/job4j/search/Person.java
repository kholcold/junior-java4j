package ru.job4j.search;

/**
 * Класс полльзователь.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 03.05.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
