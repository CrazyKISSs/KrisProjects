package module2.t04;

import java.util.Scanner;

/**
 * Стоимость покупки
 * Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
 * Входные данные
 * Программа получает на вход три числа: a, b, n.
 * Выходные данные
 * Программа должна вывести два числа: стоимость покупки в рублях и копейках.
 *
 * For example:
 * --------------------------
 * |    Input   |   Result  |
 * --------------------------
 * |    10      |   20 30   |
 * |    15      |           |
 * |    2       |           |
 * --------------------------
 * |    2       |   10  0   |
 * |    50      |           |
 * |    4       |           |
 * --------------------------
 */
public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("Введите цену пирожка: \nРублей: ");
        int a = text.nextInt();
        System.out.println("Копеек: ");
        int b = text.nextInt();
        System.out.println("Введите количество пирожков, которое нужно купить: ");
        int c = text.nextInt();
        int x = (a * 100 + b) * c;
        int rub = x / 100;
        int kop = x % 100;
        System.out.println("Для покупки вам потребуется: " + rub + "рублей, " + kop + "копеек.");

    }
}
