package module2.t13;

import java.util.Scanner;

/**
 * Ввести 4-значное число и подсчитать сумму первой и третьей цифры и разность второй и четвертой цифры
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите  4-значное число: ");
        int a = console.nextInt();

        while ((a < 1000) || (a > 9999)) {
            System.out.println("4-значное число состоит из четырёх цифр!!! \nПопробуйте ещё раз: ");
            a = console.nextInt();
        }
        int ed = a % 10;
        int des = ((a % 100) % 100) / 10;
        int sot = (a % 1000) / 100;
        int tis = a / 1000;
        System.out.println("Сумма первой и третьей цифры числа " + a + " = " + (tis + des) + "\nРаность второй и четвёртой цифры числа " + a + " = " + (sot - ed));
    }
}
