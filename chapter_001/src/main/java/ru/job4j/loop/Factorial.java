package ru.job4j.loop;

/**
 * Класс нахождения факториала.
 *
 * @author Alexandr Kh.
 * @since 19.04.18
 */
public class Factorial {
    /**
     * Метод нахождения факториала.
     *
     * @param n входящий параметр.
     * @return результат.
     */
    public int calc(int n) {
        int result = 1;
        if (n == 0) {
            return result;
        } else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
