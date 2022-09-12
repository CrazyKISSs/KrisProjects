package module2.t08;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Написать программу, которая  предоставляет пользователю возможность ввести с клавиатуры
 * количество рублей, и переводит его в доллары и евро
 */

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#.####");
        Scanner text = new Scanner(System.in);
        System.out.println("Введите сумму в рублях: ");
        int rub = text.nextInt();
        double dollar = rub * 0.0167;
        String doll = decimalFormat.format(dollar);
        double euro = rub * 0.0165;
        String eur = decimalFormat.format(euro);
        System.out.println(rub + " рублей - это: \n" + doll + " долларов,\nили " + eur + " евро");
    }
}
