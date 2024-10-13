package Lesson12;

import static Lesson12.ArrayException.ArraySizeException;
import static Lesson12.DataException.ArrayDataException;

public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "8", "3", "2"},
                {"2", "5", "6", "7"},
                {"3", "8", "4", "ф"},
                {"4", "7", "3", "5"}
        };

        try {
            ArraySizeException(array);
            System.out.println("Размер массива корректный");
        }
        catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

        try {
            ArrayDataException(array);
            System.out.println("Формат массива корректный");
        }
        catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }
}