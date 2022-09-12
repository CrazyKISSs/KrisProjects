package module4.t02;

import java.util.Scanner;

/**
 * Выведите на экран сумму четных элементов массива.
 *
 *  Если в массиве нет четных элементов, выведите "NO".
 *
 *  Например:
 *
 *  Input	        Result
 *  6
 *  1 2 3 4 5 6	    12
 *  5
 *  9 7 5 3 1	    NO
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
        chetn(array);
    }

    static void  chetn(int[] array){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]% 2 == 0){
                sum = sum + array[i];
                count ++;
            }
        }
        if (count > 0){
            System.out.println("Сумма чётных элементов = " + sum);
        }
        else {
            System.out.println("Среди представленных чисел нет чётных");
        }
    }
}
