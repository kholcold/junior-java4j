package ru.job4j.sort;

import java.util.Comparator;

/**
 * Компаратор для сравнения двух массивов символов.
 */
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int size = left.length() < right.length() ? left.length() : right.length();
        int result = 0;

        for (int i = 0; i < size; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }

        if ((result == 0) && (left.length() != right.length())) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
