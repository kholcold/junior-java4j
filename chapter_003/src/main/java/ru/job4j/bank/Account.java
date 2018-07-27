package ru.job4j.bank;

import java.util.Objects;

public class Account {
    /**
     * Кол-во денег.
     */
    private double value;
    /**
     * Реквизиты счета.
     */
    private String requisites;

    /**
     * Получить количество денег.
     *
     * @return кол-во денег.
     */
    public double getValue() {
        return value;
    }

    /**
     * Задать кол-во денег.
     *
     * @param value кол-во денег.
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Получить номер счета.
     *
     * @return номер счета.
     */
    public String getRequisites() {
        return requisites;
    }

    /**
     * Задать номер счета.
     *
     * @param requisites
     */
    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    /**
     * Конструктор счета.
     *
     * @param value      кол-во денег.
     * @param requisites номер счета.
     */
    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Double.compare(account.value, value) == 0 && requisites == account.requisites;
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, requisites);
    }

    @Override
    public String toString() {
        return "Account{"
                + "value=" + value
                + ", requisites=" + requisites
                + '}';
    }
}
