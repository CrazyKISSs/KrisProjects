package module3.t19;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализовать программу-лотерею.
 * Программа загадывает 5 (неповторяющихся) чисел в диапазоне от 1 до 42, но не показывает их на экран.
 * Пользователь пытается их угадать – вводит каких-то 5 чисел с клавиатуры.
 * Назначить призы за совпадение.
 *
 * Например, если пользователь угадал три числа - приз 300 рублей,
 * если 4 - 4000 рублей, если 5 – 50000 рублей.
 * И в целом, какова вероятность того, что пользователь угадает все 5 чисел?
 */

public class Main {

    public static int index;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] neizvestn = new int[5];

        for (int i = 0; i < 5; i++) {
            neizvestn[i] = (int) (Math.random() * 42) + 1;
        }

 //       System.out.println("Я загадал: " + Arrays.toString(neizvestn));

        System.out.println("Загадываю 5 чисел от 1 до 42...........\nПопробуй угадать все 5!");
        int[] izvestn = new int[5];

        for (int i = 0; i < 5; i++) {
            izvestn[i] = console.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (izvestn[j] == neizvestn[i])
                    index ++;
            }

        }
        System.out.println("Я загадал: " + Arrays.toString(neizvestn));
        switch (index){
            case 0:
                System.out.println("К сожалению тебе не удалось угадать ни одного числа! Не, переживай, в следующий раз у тебя обязательно получится!");
                break;
            case 1:
                System.out.println("Тебе удалось угадать 1 число! Ну хоть что-то..");
                break;
            case 2:
                System.out.println("Тебе удалось угадать 2 числа! Не плохо!..");
                break;
            case  3:
                System.out.println("Тебе удалось угадать 3 числа! Ты молодец! Твой выигрыш составляет 300 р! Но где его можно получить, я не знаю! :Р");
                break;
            case 4:
                System.out.println("Тебе удалось угадать 4 числа! Ого! Срочно беги за лотырейным билетом! У тебя таллант!");
                break;
            case 5:
                System.out.println("Ничего себе! Тебе удалось угадать все 5 чисел! Видимо, ты - Ванга!");
                break;
        }

    }
}
