/**
 * Калабеков С.К.
 * Группа: GU_QA_1877(28.10.2021)
 * ДЗ №2
 * 8.08.2022
 * */

package Homework_2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "1"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Значение в массиве не число!");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j  + "; Значение в ячейке: " + arr[e.i][e.j]);
        }
    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
    }
}
