package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 07.05.18.
 * @version 1.0.
 * @since 0.1.
 */
public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0 ,0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when7ElementsRows2() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                2
        );
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 6, 7, 0}
        };
        assertThat(result, is(expect));
    }

    /**
     * Тест.
     */
    @Test
    public void whenConvertListOneInteger() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<int[]> ints = Arrays.asList(new int[]{1, 2}, new int[]{3, 4, 5, 6});
        assertThat(result, is(list.convert(ints)));
    }

    /**
     * Тест.
     */
    @Test
    public void whenConvertListOneIntegerTen() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = Arrays.asList(11, 22, 33, 44, 55, 66);
        List<int[]> ints = Arrays.asList(new int[]{11, 22}, new int[]{33, 44, 55, 66});
        assertThat(result, is(list.convert(ints)));
    }
}
