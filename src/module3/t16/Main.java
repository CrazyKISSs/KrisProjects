package module3.t16;

import java.util.Scanner;

/**
 * Вывести на экран горизонтальную линию из звёздочек.
 * Число звездочек указывает пользователь
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Я умею рисовать звёзды и сердечки! Что тебе нарисовать?\nЕсли хочешь увидеть звёзды, введи цифру - 1,\nЕсли хочешь увидеть сердечки, введи цифру - 2:");
        int k = console.nextInt();
        switch (k){
            case 1:
                System.out.println("Сколько звёзд нарисовать для тебя?");
                int z = console.nextInt();
                for (int i = 0; i < z; i++) {
                    System.out.print('\u272d' + "  ");
                }
                break;
            case 2:
                System.out.println("Сколько сердечек нарисовать для тебя?");
                int m = console.nextInt();
                for (int i = 0; i < m; i++) {
                    System.out.print('\u2661' + "  ");
                }
                break;
            default:
                System.out.println("Не совсем понимаю, что значит " + k + ", но, если ты настаиваешь...\nСколько раз нарисовать для тебя цифру " + k + "?");
                int l = console.nextInt();
                for (int i = 0; i < l; i++) {
                    System.out.print(k + "  ");
                }
        }

    }
}
