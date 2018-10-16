package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class Converter.
 * 5.1.4. Создать convert(Iterator<Iterator>) [#152].
 * Реализовать класс с методом Iterator<Integer> convert(Iterator<Iterator<Integer>> it).
 */
public class Converter {
    Iterator<Integer> convert(Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            private Iterator<Integer> iterator = it.next();

            /**
             *Узнаем, есть ли следующий элемент и неn пропусков.
             * @return True or false.
             */
            @Override
            public boolean hasNext() {
                while (iterator == null || !iterator.hasNext()) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    iterator = it.next();
                }
                return true;
            }

            /**
             * Получаем следующий элементы.
             * @return Элемент.
             */
            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                } else {
                    return iterator.next();
                }
            }
        };
    }
}
