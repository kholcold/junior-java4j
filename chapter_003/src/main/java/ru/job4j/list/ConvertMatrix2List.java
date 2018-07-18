package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 05.06.18.
 * @version 1.0.
 * @since 0.1.
 */
public class ConvertMatrix2List {
    /**
     * Метод конвертация двумерного массива в ArrayList.
     *
     * @param array входящий массив.
     * @return ArrayList.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] i : array) {
            for (int j : i) {
                list.add(j);
            }
        }
        return list;
    }
}