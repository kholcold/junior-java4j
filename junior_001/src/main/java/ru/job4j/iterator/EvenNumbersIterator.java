package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class EvenNumbersIterator.
 * Создать итератор возвращающий только четные цифры.
 * Итератор должен принимать список произвольных чисел.
 */
public class EvenNumbersIterator implements Iterator {
    /**
     * Массив.
     */
    private int[] arrays;
    /**
     * Индекс.
     */
    private int index = 0;

    /**
     * Конструктор.
     *
     * @param arrays Массив.
     */
    public EvenNumbersIterator(int[] arrays) {
        this.arrays = arrays;
    }

    /**
     * Переопределенный метод hasNext.
     * Проверяет массив на четные элементы.
     *
     * @return Вернет true если есть четные элементы или false.
     */
    @Override
    public boolean hasNext() {
        for (int i = index; i < arrays.length; i++) {
            if (arrays[i] % 2 == 0) {
                index = i;
                return true;
            }
        }
        return false;
    }

    /**
     * Метод прохода массива.
     *
     * @return Четные элементы.
     */
    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return arrays[index++];
    }
}
