package Lesson12;

public class DataException {
    public static void ArrayDataException(String[][] dataCheck) throws MyArrayDataException {
        int[][] dataCheckToInt = new int[dataCheck.length][dataCheck[0].length];
        int count = 0;

        for (int i = 0; i < dataCheck.length; i++) {
            for (int j = 0; j < dataCheck[i].length; j++) {
                try {
                    dataCheckToInt[i][j] = Integer.parseInt(dataCheck[i][j]);
                    count += dataCheckToInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат массива [" + i + "][" + j + "]: '" + dataCheck[i][j] + "'");
                }
            }
        }
        System.out.println("Сумма элементов: " + count);
    }
}

