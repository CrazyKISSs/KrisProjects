package module3.t18;

import java.util.Scanner;

/**
 * Написать программу, которая предлагает пользователю ввести номер дня недели,
 * и в ответ показывает название этого дня (например, 6 – это суббота).
 * Решить с использованием if и switch.
 */

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Напиши номер дня недели и я скажу тебе, как переводится этот день недели на английский и французский");
        int den = console.nextInt();

        if (den > 0 && den < 8) {
            switch (den){
                case 1:
                    System.out.println("Понедельник:\n-en: Monday\n-fr: Lundi");
                    break;
                case 2:
                    System.out.println("Вторник:\n-en: Tuesday\n-fr: Mardi");
                    break;
                case 3:
                    System.out.println("Среда:\n-en: Wednesday\n-fr: Mercredi");
                    break;
                case 4:
                    System.out.println("Четверг:\n-en: Thursday\n-fr: Jeudi");
                    break;
                case 5:
                    System.out.println("Пятница:\n-en: Friday\n-fr: Vendredi");
                    break;
                case 6:
                    System.out.println("Суббота:\n-en: Saturday\n-fr: Samedi");
                    break;
                case 7:
                    System.out.println("Воскресенье:\n-en: Sunday\n-fr: Dimanche");
            }
        }
        else
            System.out.println("Такого дня недели нет!");
    }
}
