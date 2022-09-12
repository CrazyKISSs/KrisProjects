package module4.t01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В этой задаче нужно вводить с клавиатуры значения элементов массива.
 *
 * Нужно заполнить значения элементов массива числами последовательности:
 *
 * 4, 7, 10, 13, 16, ,,,
 *
 * и вывести получившийся массив на экран.
 *
 * Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран,
 * не попадая в массив.
 *
 * Например:
 *
 *  Input	                    Result
 *  6
 *  4 7 10 13 16 19         { 4, 7, 10, 13, 16, 19 }
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите " + n + " чисел: ");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        sort(array);
        System.out.println("Сортирую значения по возрастанию....");
        System.out.println(Arrays.toString(array));
    }
    static int[] sort(int[] array){
        int min;
        int temp;

        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    temp = min;
                    min = array[j];
                    array[j] = temp;
                }
            }
            array[i] = min;
        }
        return array;
    }

}
