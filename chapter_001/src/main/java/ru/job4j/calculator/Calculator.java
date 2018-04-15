package ru.job4j.calculator;

/**
 * Простой калькулятор.
 *
 * @author Alexandr Kh.
 * @version 0.1
 * @since 15.04.2018
 */
public class Calculator {
    /**
     * В переменной result храним результат вычислений.
     */
    private double result;

    /**
     * Метод сложения.
     *
     * @param first первое значение.
     * @param second второе значение.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Метод вычитания.
     *
     * @param first первое значение.
     * @param second второе значение.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Метод деления.
     *
     * @param first первое значение.
     * @param second второе значение.
     */
    public  void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Метод умножения.
     *
     * @param first первое значение.
     * @param second второе значение.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    /**
     * Возвращаем результат.
     *
     * @return result.
     */
    public double getResult() {
        return this.result;
    }
}
