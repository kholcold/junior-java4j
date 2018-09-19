package ru.job4j.tictactoe;

/**
 * Class Logic3T.
 * В этом задании нужно реализовать игру крестики-нолики.
 * В этом задании задан каркас приложения. Вам нужно реализовать только один класс Logic3T.
 * Игра имеет визуальный интерфейс сделанных через JavaFX.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com).
 * @since 18.06.2018.
 */
public class Logic3T {
    private final Figure3T[][] table;

    public Logic3T(Figure3T[][] table) {
        this.table = table;
    }

    /**
     * Логика крестиков.
     *
     * @return результат.
     */
    public boolean isWinnerX() {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i].hasMarkX()) {
                count++;
                if (count == table.length) {
                    result = true;
                }
            } else if (table[table.length - 1 - i][i].hasMarkX()) {
                count++;
                if (count == table.length) {
                    result = true;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            int plusCount = 0;
            for (int j = 0; j < table.length; j++) {
                if (table[i][j].hasMarkX()) {
                    plusCount++;
                    if (plusCount == table.length) {
                        result = true;
                    }
                } else if (table[j][i].hasMarkX()) {
                    plusCount++;
                    if (plusCount == table.length) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    /**
     * Логика ноликов.
     *
     * @return результат.
     */
    public boolean isWinnerO() {
        boolean result = false;
        int count = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i][i].hasMarkO()) {
                count++;
                if (count == table.length) {
                    result = true;
                }
            } else if (table[table.length - 1 - i][i].hasMarkO()) {
                count++;
                if (count == table.length) {
                    result = true;
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            int plusCount = 0;
            for (int j = 0; j < table.length; j++) {
                if (table[i][j].hasMarkO()) {
                    plusCount++;
                    if (plusCount == table.length) {
                        result = true;
                    }
                } else if (table[j][i].hasMarkO()) {
                    plusCount++;
                    if (plusCount == table.length) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    /**
     * Проверка на пустые клетки.
     *
     * @return результат.
     */
    public boolean hasGap() {
        boolean result = false;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (!table[i][j].hasMarkX() && !table[i][j].hasMarkO()) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
