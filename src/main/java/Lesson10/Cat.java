package Lesson10;

public class Cat extends Animal{
    private static int Count = 0;
    private boolean isFull;

    public Cat(String name) {
        super(name, 200, 0);
        this.isFull = false;
        Count++;
    }
    public static int getCatCount() {
        return Count;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Bowl bowl){
        if(bowl.getFood() > 0){
            bowl.foodDecrease(10);
            isFull = true;
            System.out.println(name + " наелся и доволен");
        }
        else {
            System.out.println("В миске еды недостаточно");
        }
    }
}
