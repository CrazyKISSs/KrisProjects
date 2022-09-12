package module2.t12;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры
 * (например, ввести 357  и 702 – получить и вывести числа  307 и 752)
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите два 3-значных числа: ");
        int a = console.nextInt();
        int b = console.nextInt();
        while ((a < 100) || (b < 100) || (a > 999) || (b > 999)) {
            System.out.println("3-значное число состоит из трёх цифр!!! \nПопробуйте ещё раз: ");
            a = console.nextInt();
            b = console.nextInt();
        }
        System.out.println("" + a + "   " + b + "  ok....");
        int ed1 = a % 10;
        int des1 = (a % 100) / 10;
        int sot1 = a / 100;
        int ed2 = b % 10;
        int des2 = (b % 100) / 10;
        int sot2 = b / 100;
        System.out.println("Волшебство.......");
        System.out.println("" + sot1 + des2 + ed1 + "   " + sot2 + des1 + ed2);
    }
}
