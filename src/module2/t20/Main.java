package module2.t20;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры дробное число.
 * Округлить его до двух знаков после запятой и вывести на экран
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Введите дробное число: ");
        double d = console.nextDouble();
        String result = decimalFormat.format(d);
        System.out.println(result);

    }
}
