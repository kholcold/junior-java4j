package ru.job4j.array;

/**
 * Класс классического перебора.
 *
 * @author Alexandr Kh.
 * @since 20.04.18
 */
public class FindLoop {
    /**
     * Метод поиска.
     *
     * @param data массив.
     * @param el   что ищем.
     * @return результат.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
