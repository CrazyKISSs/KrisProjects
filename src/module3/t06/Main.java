package module3.t06;

import java.util.Scanner;

/**
 * Ввести с клавиатуры пятизначное число и определить, является ли оно палиндромом
 *
 * -------|---------|
 * Input  |  Result |
 * -------|---------|
 * 12321  |  true   |
 * 12345  |  false  |
 * -------|---------|
 *
 */

public class Main {
    static boolean polin;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите целое число (не более семизначного, можно отрицательное): ");
        int a = scanner.nextInt();
        while (Math.abs(a) > 9_999_999) {
            System.out.println("Это слишком длинное число! Введите пожалуйста другое целое число (не длинее #_###_###, можно отрицательное):");
            a = scanner.nextInt();
        }
        printPolindrom(a, polindrom(a));

    }
     static boolean polindrom(int a){
        if (Math.abs(a) < 10)
            polin = true;
        else if (Math.abs(a) < 100 && Math.abs(a) > 9) {
            int x = a / 10;
            int y = a % 10;
            polin = x == y;
        }
        else if (Math.abs(a) > 99 && Math.abs(a) < 1000) {
            int x = a / 100;
            int y = a % 10;
            polin = x == y;
        }
        else if (Math.abs(a) > 999 && Math.abs(a) < 10_000){
            int x = a / 1000;
            int y = a % 10;
            int k = (a / 100) % 10;
            int m = (a % 100) / 10;
            polin = (x == y) && (k == m);
        } 
        else if (Math.abs(a) > 9999 && Math.abs(a) < 100_000) {
            int x = a / 10_000;
            int y = a % 10;
            int k = (a / 1000) % 10;
            int m = (a % 100) / 10;
            polin = (x == y) && (k == m);
        }
        else if (Math.abs(a) > 99999 && Math.abs(a) < 1_000_000) {
            int x = a / 100_000;
            int y = a % 10;
            int k = (a / 10_000) % 10;
            int m = (a % 100) / 10;
            int b = (a / 1000) % 10;
            int c = (a % 1000) / 100;
            polin = (x == y) && (k == m) && (b == c);
        }
        else if (Math.abs(a) > 999_999 && Math.abs(a) < 10_000_000) {
            int x = a / 1_000_000;
            int y = a % 10;
            int k = (a / 100_000) % 10;
            int m = (a % 100) / 10;
            int b = (a / 10_000) % 10;
            int c = (a % 1000) / 100;
            polin = (x == y) && (k == m) && (b == c);
        }

         return polin;
     }

     static  void  printPolindrom(int a, boolean polin){
        if (polin){
            System.out.println("Число " + a + " является полиндромом!");
        }
        else
            System.out.println("Число " + a + " не является полиндромом!");
     }
}
