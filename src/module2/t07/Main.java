package module2.t07;

import java.util.Scanner;

/**
 *
 * Написать программу, которая находит корень линейного уравнения:
 * ax + b = 0
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Для решения уравнения ax + b = 0, введите значения  \"a\" и \"b\"");
        int a = text.nextInt();
        int b = text.nextInt();
        int x = - (b / a);
        System.out.println(" x = " + x);
    }
}
