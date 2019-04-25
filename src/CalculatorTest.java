import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTest {

    @Test
    public void shouldGetMultiply3and4Result() {
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldGetMultiply5and7Result() {
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5, 7);
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldGetDivide3and2Result() {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3,2);
        assertThat(actual,is(expected));
    }

    @Test
    public void shouldThrowWhenDivide5and0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Calculator calc = new Calculator();
                    calc.divide(5,0);
                },
                "Expected calc.divide() to throw, but it didn't");
    }

}