import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int arraySize = in.nextInt(); //запись размера массива в переменную
int array[] = new int[arraySize]; //объявление массива
System.out.print("Задайте элементы массива через пробел: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = in.nextInt(); //цикл для записи значений в массив
        }
        System.out.print("Значения массива, умноженные на 2:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(" " + (array[i]*2));
        }
    }
}
