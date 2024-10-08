package Lesson10;

public interface Form {
    double calculatePerimeter();
    double calculateArea();

    default void printInfo(String fillColor, String borderColor) {
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + fillColor);
        System.out.println("Цвет границы: " + borderColor);
    }
}
