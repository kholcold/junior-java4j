package ru.job4j.array;

/**
 * Class Check.
 * Массив заполнен true или false.
 * 1. Необходимо создать класс Check.
 * 2. В классе Check написать метод public boolean mono(boolean[] data).
 */
public class Check {
    /**
     * Метод должен проверить, что все элементы в массиве являются true или false.
     * @param data входящий массив.
     * @return результат.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == data[1]) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
