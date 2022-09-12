package module2.t19;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры время начала и время завершения телефонного разговора
 * (часы, минуты и секунды).
 * Посчитать стоимость разговора, если стоимость минуты составляет 15 копеек, с учётом посекундной
 * тарификации
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длительность телефонного разговора в формате: \nчасы: \nминуты: \nсекунды: ");
        int h = console.nextInt();
        int min = console.nextInt();
        int sek = console.nextInt();
        min = min + (h * 60);
        double k = (double) sek * 15 / 60;
        int sum = (int) Math.round(min * 15 + k);
        System.out.println(sum);
        int rub = sum/100;
        int kop = sum % 100;
        System.out.println("Вы постратили на разговор " + rub + " рублей и " + kop + " копеек.");

    }
}
