package ru.job4j.pseudo;

/**
 * Тругольник.
 *
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 26.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Triangle implements Shape {

    /**
     * Рисуем фигуру.
     *
     * @return фигура.
     */
    @Override
    public String draw() {
        StringBuilder pic = new StringBuilder();
        pic.append("   +   ");
        pic.append("  + +  ");
        pic.append(" +   + ");
        pic.append("+++++++");
        return pic.toString();
    }
}
