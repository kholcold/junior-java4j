package ru.job4j.array;

/**
 * Класс заполнения массива степенями чисел.
 *
 * @author Alexandr Kh.
 * @since 20.04.18
 */
public class Square {
    /**
     * Метод заполнения массива и возведения в квадрат чисел.
     *
     * @param bound кол-во чисел.
     * @return результат.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}
