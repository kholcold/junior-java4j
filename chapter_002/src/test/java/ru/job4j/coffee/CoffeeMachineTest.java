package ru.job4j.coffee;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoffeeMachineTest {
    @Test
    public void whenTestOne() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.changes(50, 35);
        int[] isInt = {10, 5};
        assertThat(resultMachine, is(isInt));
    }

    @Test
    public void whenTestTwo() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.changes(100, 35);
        int[] isInt = {10, 10, 10, 10, 10, 10, 5};
        assertThat(resultMachine, is(isInt));
    }

    @Test
    public void whenTestThree() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.changes(100, 36);
        int[] isInt = {10, 10, 10, 10, 10, 10, 2, 2};
        assertThat(resultMachine, is(isInt));
    }

    @Test
    public void whenTestFour() {
        CoffeeMachine machine = new CoffeeMachine();
        int[] resultMachine = machine.changes(25, 35);
        int[] isInt = null;
        assertThat(resultMachine, is(isInt));
    }

}
