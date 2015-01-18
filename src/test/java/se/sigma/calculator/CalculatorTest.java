package se.sigma.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void shouldCalculateFibonacci() {
        Calculator calculator = new Calculator();
        int expected = 13;
        int actual = calculator.nextFibonacci(5, 8);

        assertThat(actual, is(expected));
    }
}
