package Lesson10;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1:
        System.out.println("\nЗадание 1:");

        Dog dog1 = new Dog("Баклажан");
        Cat cat1 = new Cat("Нагетс");

        dog1.run(200);
        cat1.swim(9);

        cat1.run(500);
        dog1.swim(0);

        Bowl bowl = new Bowl(60);

        cat1.eat(bowl);

        bowl.addFood(15);

        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество котов: " + Cat.getCatCount());

        //Задание 2
        System.out.println("\nЗадание 2:");

        Form circle = new Circle(5);
        Form rectangle = new Rectangle(4, 6);
        Form triangle = new Triangle(3, 4, 5);

        String circleFillColor = "Красный";
        String circleBorderColor = "Чёрный";

        String rectangleFillColor = "Синий";
        String rectangleBorderColor = "Зелёный";

        String triangleFillColor = "Жёлтый";
        String triangleBorderColor = "Фиолетовый";

        System.out.println("Круг:");
        circle.printInfo(circleFillColor, circleBorderColor);
        System.out.println();

        System.out.println("Прямоугольник:");
        rectangle.printInfo(rectangleFillColor, rectangleBorderColor);
        System.out.println();

        System.out.println("Треугольник:");
        triangle.printInfo(triangleFillColor, triangleBorderColor);
    }
}