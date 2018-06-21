package ru.job4j.tracker;

import java.util.ArrayList;

/**
 * Class StubInput.
 * @author Alexandr.
 * @since 06.12.2017
 */
public class StubInput implements Input {
    /**
     * Массив.
     */
    private String[] answers;
    /**
     * Позиция.
     */
    private int position = 0;

    /**
     * Конструктор.
     * @param answers String
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    public String ask(String question) {
        return answers[position++];
    }

    public int ask(String question, ArrayList<Integer> range) {
        //throw new UnsupportedOperationException("Unsupported operation");
        return -1;
    }
}
