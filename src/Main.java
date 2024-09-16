import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Вызов всех методов
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(intNumber());
        positiveNegativeNumber();
        System.out.println(positiveNumb());
        printStringMultipleTimes("Привет, мир! ", 5);
        System.out.println(isLeapYear());
        zeroOneMassiv();
        massiveHundred();
        underSixMassive();
        DiagonalArray();

        // Задание 14: инициализация массива с определённой длиной и значением
        int len = 8;
        int initialValue = 7;
        int[] result = initializeArray(len, initialValue);

        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    // Задание 1: Печатает три слова в столбец
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

    // Задание 2: Проверяет сумму двух переменных и печатает, положительная она или отрицательная
    public  static void checkSumSign(){
        int a = 8;
        int b = 32;
        int sum = a + b;
        if(sum >= 0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

    // Задание 3: Выводит цвет в зависимости от значения переменной
    public static void printColor(){
        int value = 100;
        if(value <= 0){
            System.out.println("Красный");
        }
        else if(value > 0 && value < 100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4: Сравнивает два числа и печатает результат сравнения
    public static void compareNumbers(){
        int a = 81;
        int b = 3;
        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    // Задание 5: Проверяет, находятся ли сумма двух чисел в диапазоне от 10 до 20
    public static boolean intNumber(){
        Scanner Firstscanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = Firstscanner.nextInt();

        Scanner SecondScanner = new Scanner(System.in);
        System.out.println("Введите второе целое число: ");
        int b = SecondScanner.nextInt();

        int sum = a + b;
        if(sum >= 10 && sum <= 20){
            return true;
        }
        else {
            return false;
        }
    }

    // Задание 6: Определяет, положительное или отрицательное число
    public static void positiveNegativeNumber(){
        Scanner Firstscanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = Firstscanner.nextInt();
        if(a >= 0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }

    // Задание 7: Возвращает true, если число отрицательное, false если положительное
    public static boolean positiveNumb(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = scanner.nextInt();
        if (numb < 0){
            return true;
        }
        else {
            return false;
        }
    }

    // Задание 8: Печатает строку указанное количество раз
    public static void printStringMultipleTimes(String str, int times){
        for(int i = 0; i < times; i++){
            System.out.printf(str);
        }
    }

    // Задание 9: Определяет, является ли год високосным
    public static boolean isLeapYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if(year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    // Задание 10: Заменяет все 0 на 1 и все 1 на 0 в массиве
    public static void zeroOneMassiv(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
    }

    // Задание 11: Заполняет массив от 1 до 100 и печатает его
    public static void massiveHundred(){
        int[] arr = new int[101];
        for(int i = 1; i < arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    // Задание 12: Умножает все числа в массиве меньше 6 на 2
    public static void underSixMassive(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    // Задание 13: Заполняет диагонали квадратного массива единицами
    public static void DiagonalArray(){
        int n = 5;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Задание 14: Возвращает массив определённой длины, заполненный одинаковыми значениями
    public static int[] initializeArray(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}