package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 07.05.18.
 * @version 1.0.
 * @since 0.1.
 */
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells;

        if (list.size() % rows == 0) {
            cells = list.size() / rows;
        } else {
            cells = (list.size() / rows) + 1;
        }

        int[][] array = new int[rows][cells];
        int listIndex = 0;
        for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
            for (int cellIndex = 0; cellIndex < cells; cellIndex++) {
                if (listIndex < list.size()) {
                    array[rowIndex][cellIndex] = list.get(listIndex++);
                } else {
                    array[rowIndex][cellIndex] = 0;
                }
            }
        }

        return array;
    }

    /**
     * Пройтись по всем элементам всех массивов в списке list
     * и добавить их в один общий лист Integer.
     * @param list Входящий список.
     * @return Результат.
     */
    public List<Integer> convert (List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] ints : list) {
            for (int i : ints) {
                result.add(i);
            }
        }
        return result;
    }
}
