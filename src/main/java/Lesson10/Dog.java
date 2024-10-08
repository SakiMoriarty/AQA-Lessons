package Lesson10;

public class Dog extends Animal{
    private static int Count = 0;

    public Dog(String name) {
        super(name, 500, 10);
        Count++;
    }

    public static int getCount(){
        return Count;
    }
}
