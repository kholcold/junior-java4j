package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class MatrixIterator.
 */
public class MatrixIterator implements Iterator {

    private int[][] matrix;
    private int size;
    private int position = 0;
    private int row = 0;
    private int col = 0;

    /**
     * Конструктор.
     *
     * @param matrix Входящий массив.
     */
    public MatrixIterator(int[][] matrix) {
        this.matrix = matrix;
        this.size = countElements(matrix);
    }

    /**
     * Считаем кол-во элементов в массиве.
     *
     * @param matrix Входящий массив.
     * @return Кол-во элементов.
     */
    private int countElements(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            count += row.length;
        }
        return count;
    }


    /**
     * Узнаем, есть ли следующий элемент, и не достигнут ли конец массива.
     *
     * @return True or false.
     */
    @Override
    public boolean hasNext() {
        return position < size;
    }

    /**
     * Получаем следующий элемент.
     *
     * @return Элемент.
     */
    @Override
    public Integer next() {
        if (position >= size) {
            throw new NoSuchElementException();
        }
        int element = matrix[row][col];
        position++;
        col++;
        while (row < matrix.length && col >= matrix[row].length) {
            col = 0;
            row++;
        }
        return element;
    }
}