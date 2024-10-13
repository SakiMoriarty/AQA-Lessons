package Lesson12;

public class ArrayException {
    public static void ArraySizeException(String[][] sizeCheck) throws MyArraySizeException{
        if(sizeCheck.length != 4 || sizeCheck[0].length != 4){
            throw new MyArraySizeException("Неверная размер массива!");
        }
    }
}
