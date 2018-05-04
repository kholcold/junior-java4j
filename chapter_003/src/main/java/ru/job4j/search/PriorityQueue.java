package ru.job4j.search;

import java.util.LinkedList;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 04.05.18.
 * @version 1.0.
 * @since 0.1.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        if (tasks.size() == 0) {
            tasks.add(0, task);
        } else {
            int i = 0;
            for (Task currentTask : tasks) {
                if (task.getPriority() < currentTask.getPriority()) {
                    tasks.add(i, task);
                    return;
                }
                i++;
            }
            tasks.add(task);
        }
    }

    public Task take() {
        return this.tasks.poll();
    }
}
