package module2.t11;

import java.util.Scanner;

/**
 * Поменять местами значения переменных a и b,
 * сначала с использованием дополнительной третьей переменной, а затем – без
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите значения переменных а и b: ");
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println("a = " + a + ", b = " + b + "\nМеняем значения местами.....");
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("\nВведите значения переменных a и b: ");
        int k = console.nextInt();
        int p = console.nextInt();
        System.out.println("a = " + k + ", b = " + p + "\nМеняем значения местами.....");
        System.out.println("a = " + p + ", b = " + k);
    }
}
