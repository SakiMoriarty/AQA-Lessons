package Lesson13;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Задание 1:
        String[] wordsArray = { "яблоко", "банан",
                "апельсин", "яблоко", "груша", "виноград",
                "банан", "ананас", "апельсин", "манго",
                "яблоко", "киви", "груша", "виноград",
                "манго", "виноград", "дыня", "арбуз" };

        WordsArray.count(wordsArray);

        //Задание 2:
        System.out.println("\nЗадание 2:");

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Зубенко", "+375294561231");
        phoneDirectory.add("Владымцев", "+375215896428");
        phoneDirectory.add("Снежок", "+375256571629");
        phoneDirectory.add("Пупсиков", "+375334875268");
        phoneDirectory.add("Пупсиков", "+375445311847");
        phoneDirectory.add("Пупсиков", "+375255381562");

        System.out.println(phoneDirectory.get("Зубенко"));
        System.out.println(phoneDirectory.get("Снежок"));
        System.out.println(phoneDirectory.get("Пупсиков"));
    }
}