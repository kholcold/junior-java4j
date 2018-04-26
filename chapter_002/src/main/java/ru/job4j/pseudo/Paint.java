package ru.job4j.pseudo;

/**
 * @author Alexandr Kholodov (alexandr.khol@gmail.com) on 26.04.18.
 * @version 1.0.
 * @since 0.1.
 */
public class Paint {
    /**
     * Метод печати.
     *
     * @param shape указываем фигуру.
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
