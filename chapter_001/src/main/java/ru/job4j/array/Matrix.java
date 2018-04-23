package ru.job4j.array;

/**
 * Класс таблица умножения.
 *
 * @autor Alexandr Kh.
 * @since 23.04.18
 */
public class Matrix {
    /**
     * Метод создания двумерного массива и таблица умножения.
     *
     * @param size размер двумерного массива.
     * @return результат.
     */
    public int[][] multiple(int size) {

        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
            System.lineSeparator();
        }
        return table;
    }
}
