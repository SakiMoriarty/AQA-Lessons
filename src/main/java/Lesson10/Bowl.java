package Lesson10;

public class Bowl {
    private int food;

    public Bowl(int food){
        this.food = food;
    }

    public int getFood(){
        return food;
    }

    public void foodDecrease(int amount){
        if(food - amount >= 0){
            food -= amount;
        }
        else {
            food = 0;
        }
    }

    public void addFood(int amount){
        food += amount;
        System.out.println("Добавлено " + amount + " единиц еды в миску. Теперь в миске " + food + " единиц еды.");
    }
}
