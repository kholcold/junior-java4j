package ru.job4j.coffee;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoffeeMachineTest {
    @Test
    public void whenTestOne() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.valid(50, 35);
        int[] isInt = {10, 5};
        assertThat(resultMachine, is(isInt));
    }

    @Test
    public void whenTestTwo() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.valid(100, 35);
        int[] isInt = {10, 10, 10, 10, 10, 10, 5};
        assertThat(resultMachine, is(isInt));
    }

    @Test
    public void whenTestThree() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.valid(100, 36);
        int[] isInt = {10, 10, 10, 10, 10, 10, 2, 2};
        assertThat(resultMachine, is(isInt));
    }

    @Test
    public void whenTestFour() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.valid(25, 35);
        int[] isInt = new int[0];
        assertThat(resultMachine, is(isInt));
    }

}
