import Lesson14.GetFactorial;
import Lesson14.MyArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    void factorialPositive() throws MyArgumentException{
        assertEquals(40320, GetFactorial.factorial(8), "Факториал 8, должен быть 40320!");
    }

    @Test
    void factorialNegativeException(){
        assertThrows(IllegalArgumentException.class, () -> {
            GetFactorial.factorial(-8);
        }, "Ожидается исключение при вычислении факториала для отрицательного числа");
    }

    @Test
    void factorialZero() throws MyArgumentException {
        assertEquals(1, GetFactorial.factorial(0), "Факториал 0, должен быть 1!");
    }
}
