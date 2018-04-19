package ru.job4j.loop;

/**
 * class Counter вычисляет сумму четных чисел в диапозоне.
 *
 * @author Alexandr Kh
 * @version 0.1
 * @since 19.04.18
 */
public class Counter {
    /**
     * Метод вычисляет сумму четныx чисел в диапазоне от start до finish.
     *
     * @param start  начало.
     * @param finish конец.
     * @return результат.
     */
    public int add(int start, int finish) {
        int rslt = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                rslt += i;
            }
        }
        return rslt;
    }
}
