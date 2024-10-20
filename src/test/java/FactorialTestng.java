import Lesson14.GetFactorial;
import Lesson14.MyArgumentException;
import jdk.jfr.Name;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class FactorialTestng {
    @Test
    @Name("Проверка работы вычисления факториала числа")
    void factorialPositive() throws MyArgumentException{
        assertEquals(GetFactorial.factorial(8), 40320, "Факториал 8, должен быть 40320!");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    @Name("Проверка негативного факториала")
    void factorialNegativeException() throws MyArgumentException{
        GetFactorial.factorial(-10);
    }

    @Test
    @Name("Проверка вычисления факториала на 0")
    void factorialZero() throws MyArgumentException {
        assertEquals(GetFactorial.factorial(0), 1,"Факториал 0, должен быть 1!");
    }
}
