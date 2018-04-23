package ru.job4j.array;

import java.util.Arrays;

/**
 * class ArrayDuplicate.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 23.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class ArrayDuplicate {
    /**
     * Метод убрает все дубликаты строк из массива.
     *
     * @param array входящий массив.
     * @return возвращает массив без дубликатов.
     */
    public String[] remove(String[] array) {
        int unique = array.length;
        for (int outer = 0; outer < unique; outer++) {
            for (int inner = outer + 1; inner < unique; inner++) {
                if (array[outer].equals(array[inner])) {
                    array[inner] = array[unique - 1];
                    unique--;
                    inner--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}
