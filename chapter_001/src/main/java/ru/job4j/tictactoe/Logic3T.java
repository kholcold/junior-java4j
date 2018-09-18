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
        for (int i = 0; i < table.length; i++) {
            if (table[0][0].hasMarkX()
                    && table[i][i].hasMarkX()
                    && table[table.length - 1][table.length - 1].hasMarkX()) {
                result = true;
            } else if (table[table.length - 1][i].hasMarkX()
                    && table[table.length - 2][table.length - 2].hasMarkX()
                    && table[i][table.length - 1].hasMarkX()) {
                result = true;
            } else if (table[i][0].hasMarkX()
                    && table[i][1].hasMarkX()
                    && table[i][2].hasMarkX()) {
                result = true;
            } else if (table[0][i].hasMarkX()
                    && table[1][i].hasMarkX()
                    && table[2][i].hasMarkX()) {
                result = true;
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
        for (int i = 0; i < table.length; i++) {
            if (table[0][0].hasMarkO()
                    && table[i][i].hasMarkO()
                    && table[table.length - 1][table.length - 1].hasMarkO()) {
                result = true;
            } else if (table[table.length - 1][i].hasMarkO()
                    && table[table.length - 2][table.length - 2].hasMarkO()
                    && table[i][table.length - 1].hasMarkO()) {
                result = true;
            } else if (table[i][0].hasMarkO()
                    && table[i][1].hasMarkO()
                    && table[i][2].hasMarkO()) {
                result = true;
            } else if (table[0][i].hasMarkO()
                    && table[1][i].hasMarkO()
                    && table[2][i].hasMarkO()) {
                result = true;
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
