package module2.t03;

import java.util.Scanner;

/**
 * Дано целое число n. Выведите следующее за ним четное число.
 * При решении этой задачи нельзя использовать условную инструкцию if и циклы.
 * Входные данные
 * Вводится натуральное число.
 * Выходные данные
 * Выведите ответ на задачу.
 *
 * For example:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    7       |   8       |
 * --------------------------
 * |    8       |   10      |
 * --------------------------
 */
public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = text.nextInt();

        int k = x % 2 == 0? x+2 : x+1;
        System.out.println("Следующее чётное число после x: " + k);

    }
}
