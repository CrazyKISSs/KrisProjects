package module2.t10;

import java.util.Scanner;

/**
 * Написать программу, которая переводит указанное количество градусов по Цельсию в
 * градусы по шкале Фаренгейта, Кельвина, Реомюра и Делиля.
 * Затем реализовать перевод из градусов по Фаренгейту в градусы по Цельсию
 */

public class Main {
    public static void main(String[] args) {
        Scanner consol = new Scanner((System.in));
        System.out.println("Напишите значение градусов по Цельсию " + '\u00b0' + "C :");
        double c = consol.nextDouble();
        double f = c * 9 / 5 + 32;
        double k = c + 273.15;
        double r = c * 0.8;
        double d = (100 - c) * 3 / 2;
        System.out.println(c + " " + '\u00b0' + "C - это:");
        System.out.println(f + " " + '\u00b0' + "F");
        System.out.println(k + " K");
        System.out.println(r + " " + '\u00b0' + "Re");
        System.out.println(d + " " + '\u00b0' + "De\n");

        System.out.println("Напишите значение градусов по Фарингейту " + '\u00b0' + "F :");
        double f2 = consol.nextDouble();
        double c2 = (f2 - 32) * 5 / 9;
        System.out.println(f2 + " " + '\u00b0' + "F - это:");
        System.out.println(c2 + " " + '\u00b0' + "C");

    }
}
