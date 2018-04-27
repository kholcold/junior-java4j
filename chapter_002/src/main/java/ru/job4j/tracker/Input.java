package ru.job4j.tracker;

/**
 * Интерфейс ввода.
 */
public interface Input {
    /**
     * Метод ввода вопроса.
     *
     * @param question вопрос.
     * @return String.
     */
    String ask(String question);

    /**
     * Метод без реализации
     * @param question Принимает String.
     * @param range Принимает массив.
     * @return вернем int.
     */
    int ask(String question, int[] range);
}
