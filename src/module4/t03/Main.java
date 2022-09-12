package module4.t03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Развернуть массив в обратную сторону ("задом наперед").
 *
 *  Последний элемент должен находится на месте начального и наоборот.
 *
 *  Не разрешается использовать дополнительный массив.
 *
 *  Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя
 *  в памяти значение элементов массива.
 *
 *  For example:
 *
 *  Input	            Result
 *  6
 *  1 2 3 4 5 6	        6 5 4 3 2 1
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
        perestanovka(array);
        System.out.println("Вывожу в обратном порядке: ");
        System.out.println(Arrays.toString(array));
    }
    static int[] perestanovka(int[] array){
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
