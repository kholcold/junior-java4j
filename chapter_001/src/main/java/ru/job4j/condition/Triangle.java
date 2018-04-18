package ru.job4j.condition;

/**
 * Класс Triangle.
 *
 * @author Alexandr Kh
 * @since 18.04.18
 */
public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    /**
     * Конструктор класса.
     *
     * @param a первый параметр.
     * @param b второй параметр.
     * @param c третий параметр.
     */
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * @param ab растояние между точками a b.
     * @param ac растояние между точками a c.
     * @param bc растояние между точками b c.
     * @return Периметр.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник существует или -1
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param ab длина от точки a b.
     * @param ac длина от точки a c.
     * @param bc длина от точки b c.
     * @return true/false.
     */
    private boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc || ac + bc > ab || bc + ab > ac;
    }
}
