import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePolishNotationCalculatorTest {
    private final ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateSumWhenPositiveNumbers() {
        int result = calculator.calculatePolishNotation("2 1 +");
        assertEquals(3, result);
    }

    @Test
    public void shouldCalculateDifferenceWhenPositiveNumbers() {
        int result = calculator.calculatePolishNotation("2 1 -");
        assertEquals(1, result);
    }

    @Test
    public void shouldCalculateMultiplicationWhenPositiveNumbers() {
        int result = calculator.calculatePolishNotation("2 1 *");
        assertEquals(2, result);
    }

    @Test
    public void shouldCalculateSumWhenNegativeNumbers() {
        int result = calculator.calculatePolishNotation("-2 -1 +");
        assertEquals(-3, result);
    }

    @Test
    public void shouldCalculateDifferenceWhenNegativeNumbers() {
        int result = calculator.calculatePolishNotation("-2 -1 -");
        assertEquals(-1, result);
    }

    @Test
    public void shouldCalculateMultiplicationWhenNegativeNumbers() {
        int result = calculator.calculatePolishNotation("-2 -1 *");
        assertEquals(2, result);
    }

    @Test
    public void shouldProcessMultipleSpaces() {
        int result = calculator.calculatePolishNotation("2       1   +");
        assertEquals(3, result);
    }
}