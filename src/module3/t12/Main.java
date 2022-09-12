package module3.t12;

import java.util.Scanner;

/**
 * Пользователь вводит 4 числа с клавиатуры,
 * найти среди них максимальное (минимальное) значение
 * используя тернарный оператор.
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 4 числа:");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();
        int d = console.nextInt();

        int min = (a < b ? a : b) < (c < d ? c : d) ? (a < b ? a : b) : (c < d ? c : d);
        int max = (a > b ? a : b) > (c > d ? c : d) ? (a > b ? a : b) : (c > d ? c : d);
        System.out.println(min + " - минимальное из этих чисел");
        System.out.println(max + " - максимальное из этих чисел");
    }
}
