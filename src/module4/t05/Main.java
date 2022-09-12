package module4.t05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Напишите программу, которая выполняет "сжатие массива целых чисел" –
 *  переставляет все нулевые элементы в конец.
 *  При этом все ненулевые элементы располагаются в начале в том же порядке.
 *
 *  Input	            Result
 *  6
 *  1 0 2 0 3 4         1 2 3 4 0 0
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
        sortirovka(array);
        System.out.println(Arrays.toString(array));
    }

    static int[] sortirovka(int[] array){
        int[] temp = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                temp[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
        return array;
    }
}
