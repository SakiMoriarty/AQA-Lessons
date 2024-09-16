import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(intNumber());
        //positiveNegativeNumber();
        //System.out.println(positiveNumb());
        //printStringMultipleTimes("Привет, мир! ", 5);
        //System.out.println(isLeapYear());
        //zeroOneMassiv();
        //massiveHundred();
        //underSixMassive();
        //DiagonalArray();

        //Zadanie 14
        int len = 8;
        int initialValue = 7;
        int[] result = initializeArray(len, initialValue);

        // Вывод массива
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }

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

    public static void printStringMultipleTimes(String str, int times){
        for(int i = 0; i < times; i++){
            System.out.printf(str);
        }
    }

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

    public static void massiveHundred(){
        int[] arr = new int[101];
        for(int i = 1; i < arr.length; i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    public static void underSixMassive(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

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

    public static int[] initializeArray(int len, int initialValue){
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}