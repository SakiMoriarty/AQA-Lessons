package Lesson10;

public class Attraction {
    private String name;
    private double workTime;
    private double price;

    public Attraction(String name, double workTime, double price) {
        this.name = name;
        this.workTime = workTime;
        this.price = price;
    }

    public void voice() {
        System.out.println("Аттракцион: " + name + ", Время работы: " + workTime + " часов, Стоимость: " + price + " руб.");
    }
}
