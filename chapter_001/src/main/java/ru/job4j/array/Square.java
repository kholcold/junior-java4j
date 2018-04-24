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
        int number = 1;
        for (int i = 0; i < rst.length; i++) {
            rst[i] = (int) Math.pow(number, 2);
            number++;
        }
        return rst;
    }
}
