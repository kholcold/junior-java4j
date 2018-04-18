package ru.job4j.max;

/**
 * Класс нахождения максимума из двух чисел.
 *
 * @author Alexandr Kh
 * @since 18.04.18
 */
public class Max {
    /**
     * Метод нахождения максимума.
     *
     * @param first  первое число.
     * @param second второе число.
     * @return результат.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}
