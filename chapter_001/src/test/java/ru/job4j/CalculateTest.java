package ru.job4j;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CalculateTest.
 *
 * @author Alexandr Kh
 * @version 0.1
 * @since 15.04.2018
 */
public class CalculateTest {
    /**
     * Test echo.
     */
    @Test
    public void whenTakeNameThenTreeEchoPlusName() {
       String input = "Alex Kh";
       String expect = "Echo, echo, echo : Alex Kh";
       Calculate calc = new Calculate();
       String result = calc.echo(input);
       assertThat(result, is(expect));
   }

}
