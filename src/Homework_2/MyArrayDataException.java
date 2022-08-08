package Homework_2;

public class MyArrayDataException extends Throwable {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
}
