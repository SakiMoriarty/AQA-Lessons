package Lesson14;

public class GetFactorial {
    public static int factorial(int a) throws MyArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException("Факториал не может быть отрицательным!");
        }

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}
