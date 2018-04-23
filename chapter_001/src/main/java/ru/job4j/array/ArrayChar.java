package ru.job4j.array;

/**
 * Класс ArrayChar.
 * Слова начинается с ...
 *
 * @author Alexandr Kh.
 * @since 23.04.18
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                return false;
            }
        }
        return result;
    }
}