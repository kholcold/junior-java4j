package ru.job4j.loop;

/**
 * Класс постройки псевдо графики.
 *
 * @author Alexandr Kh.
 * @since 19.04.18
 */
public class Board {
    /**
     * Метод постройки шахматной доски в псевдографике.
     *
     * @param width  ширина.
     * @param height высота.
     * @return результат.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
