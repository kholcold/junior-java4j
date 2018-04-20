package ru.job4j.array;

/**
 * Класс перевернуть массив.
 *
 * @author Alexandr Kh.
 * @since 20.04.18
 */
public class Turn {
    /**
     * Метод переворачивает массив задом наперед.
     *
     * @param array входящий массив.
     * @return результат.
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }
}
