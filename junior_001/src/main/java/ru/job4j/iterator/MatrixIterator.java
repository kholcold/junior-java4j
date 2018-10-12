package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Class MatrixIterator.
 */
public class MatrixIterator implements Iterator {

    private int[][] matrix;
    private int row = 0;
    private int col = 0;


    /**
     * Конструктор.
     *
     * @param matrix Входящий массив.
     */
    public MatrixIterator(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Узнаем, есть ли следующий элемент, и не достигнут ли конец массива.
     *
     * @return True or false.
     */


    @Override
    public boolean hasNext() {
        return row < matrix.length && col < matrix[row].length;
    }

    /**
     * Получаем следующий элемент.
     *
     * @return Элемент.
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer element = matrix[row][col++];
        if (col >= matrix[row].length) {
            col = 0;
            row++;
        }
        return element;
    }
}