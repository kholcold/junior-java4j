package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс вывода на консоль.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 26.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Вывод на консоль.
     * @param question Задает вопрос.
     * @return возвращает введенные пользователем данные.
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
