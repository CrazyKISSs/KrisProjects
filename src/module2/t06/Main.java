package module2.t06;

import java.util.Scanner;

/**
 * Найти среднее арифметическое значение трёх вещественных чисел
 */
public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите 3 вещественных числа: ");
        double a = text.nextDouble();
        double b = text.nextDouble();
        double c = text.nextDouble();
        double x = (a + b + c) / 3;
        System.out.println("Среднее арифметическое чисел: " + a + "   "+ b + "   "+ c + "   " + x);
    }
}
