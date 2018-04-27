package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {
    private String menuName;

    private int key;

    public BaseAction(String menuName, int key) {
        this.menuName = menuName;
        this.key = key;
    }

    @Override
    public int key() {
        return key;
    }

    @Override
    public String info() {
        return String.format("%s. %s", this.key(), menuName);
    }
}
