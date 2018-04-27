package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс вывода на консоль.
 *
 * @author Alexandr
 * @since 06.12.2017
 */
public class ConsoleInput implements Input {
    /**
     * Объект для ввода данных.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Вывод на консоль.
     *
     * @param question Задает вопрос.
     * @return возвращает введеные пользователем данные.
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}
