package ru.job4j.search;

/**
 * Каркас очереди с приоритетами.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 04.05.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Task {
    private String desc;
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
