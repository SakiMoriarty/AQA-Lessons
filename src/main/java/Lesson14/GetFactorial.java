package Lesson14;

public class GetFactorial {
    public static int factorial(int a){
        int result = 1;
        for(int i = 1; i <= a; i++){
            result = result * i;
        }
        return result;
    }
}
