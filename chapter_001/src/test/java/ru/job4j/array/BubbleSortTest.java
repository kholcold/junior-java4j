package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс теста BubbleSort.
 *
 * @author Alexandr Kholodov.
 * @since 20.04.18
 */
public class BubbleSortTest {
    /**
     * Тест.
     */
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        int[] result = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(bubbleSort.sort(array), is(result));
    }
}