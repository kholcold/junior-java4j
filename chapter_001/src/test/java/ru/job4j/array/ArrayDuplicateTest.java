package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 23.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class ArrayDuplicateTest {
    /**
     * Тест с одним повторение.
     */
    @Test
    public void whenTheArrayContainsOneRepetition() {
        String[] input = {"Alex", "Vova", "Alex", "Andrey"};
        String[] output = {"Alex", "Vova", "Andrey"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(output));
    }

    /**
     * Тест с несколькими повторениями.
     */

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"Alex", "Alex", "Vova", "Vova", "Alex", "Andrey", "Andrey"};
        String[] output = {"Alex", "Vova", "Andrey"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(output));
    }
}
