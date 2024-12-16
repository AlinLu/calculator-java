import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testCalculate() {
        List<Float> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        numbers.add(10f);
        numbers.add(2f);
        operations.add("/");

        Calculator.Calculate(numbers, operations);
        assertEquals(5f, Calculator.finalResult, 0.001);
    }

    @Test
    public void testCalculateWithAddition() {
        List<Float> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        numbers.add(10f);
        numbers.add(5f);
        operations.add("+");

        Calculator.Calculate(numbers, operations);
        assertEquals(15f, Calculator.finalResult, 0.001);
    }

    @Test
    public void testCalculateWithOrderOfOperations() {
        List<Float> numbers = new ArrayList<>();
        List<String> operations = new ArrayList<>();
        numbers.add(10f);
        numbers.add(5f);
        numbers.add(2f);
        operations.add("+");
        operations.add("*");

        Calculator.Calculate(numbers, operations);
        assertEquals(20f, Calculator.finalResult, 0.001);
    }
}