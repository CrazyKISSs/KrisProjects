package module4.t04;

import java.util.Scanner;

/**
 * Вывести на экран значение самого часто повторяющегося элемента массива и число повторений.
 *
 *  Если в массиве несколько таких элементов,
 *  вывести из них тот, который имеет самый меньший номер.
 *
 *  For example:
 *
 *  Input	Result
 *  6
 *  1 2 3 1 2 1	    1 (3)
 *  5
 *  10 20 30 40 50	   10 (1)
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
        powtorenia(array);
    }
    static void powtorenia(int[] array){
        int[] result = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]){
                    count++;
                }
            }
            result[i] = count;
        }
        count = 0;
        int max = result[result.length - 1];
        for (int i = result.length - 1; i >= 0; i--) {
            if (result[i] >= max){
                max = result[i];
                count = i;
            }
        }
        System.out.println("Самый часто повторяющийся элемент среди представленных: " + array[count] + " (" + max + ")");
    }
}
