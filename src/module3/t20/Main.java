package module3.t20;

import java.util.Scanner;

/**
 * Пользователь указывает дату своего рождения (число и месяц).
 * Программа определяет знак зодиака пользователя и составляет для него гороскоп на ближайшую неделю.
 */
public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Напишите месяц вашего рождения (например: июль): ");
        String mes = console.nextLine();
        System.out.println("Число вашего рождения: ");
        int k = console.nextInt();
        String zodiak = new String();
        int zod = 0;

        switch (mes) {
            case "январь":
                if (k >= 1 && k <= 19) {
                    zodiak = "Козерог";
                    zod = 12;
                }
                else  if (k > 19 && k <= 31) {
                    zodiak = "Водолей";
                    zod = 1;
                }
                else
                System.out.println("В этом месяце не числа " + k);
                break;
            case "февраль":
                if (k >= 1 && k <= 19) {
                    zodiak = "Водолей";
                    zod = 1;
                }
                else  if (k > 19 && k <= 29) {
                    zodiak = "Рыбы";
                    zod = 2;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "март":
                if (k >= 1 && k <= 20) {
                    zodiak = "Рыбы";
                    zod = 2;
                }
                else if (k > 20 && k <= 31) {
                    zodiak = "Овен";
                    zod = 3;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "апрель":
                if (k >= 1 && k <= 20) {
                    zodiak = "Овен";
                    zod = 3;
                }
                else if (k > 20 && k <= 30) {
                    zodiak = "Телец";
                    zod = 4;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "май":
                if (k >= 1 && k <= 21) {
                    zodiak = "Телец";
                    zod = 4;
                }
                else if (k > 21 && k <= 31) {
                    zodiak = "Близнецы";
                    zod = 5;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "июнь":
                if (k >= 1 && k <= 21) {
                    zodiak = "Близнецы";
                    zod = 5;
                }
                else if (k > 21 && k <= 30) {
                    zodiak = "Рак";
                    zod = 6;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "июль":
                if (k >= 1 && k <= 22) {
                    zodiak = "Рак";
                    zod = 6;
                }
                else if (k > 23 && k <= 31) {
                    zodiak = "Лев";
                    zod = 7;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "август":
                if (k >= 1 && k <= 21) {
                    zodiak = "Лев";
                    zod = 7;
                }
                else if (k > 21 && k <= 31) {
                    zodiak = "Дева";
                    zod = 8;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "сентябрь":
                if (k >= 1 && k <= 23) {
                    zodiak = "Дева";
                    zod = 8;
                }
                else if (k > 23 && k <= 30) {
                    zodiak = "Весы";
                    zod = 9;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "октябрь":
                if (k >= 1 && k <= 23) {
                    zodiak = "Весы";
                    zod = 9;
                }
                else if (k > 23 && k <= 31) {
                    zodiak = "Скорпион";
                    zod = 10;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "ноябрь":
                if (k >= 1 && k <= 22) {
                    zodiak = "Скорпион";
                    zod = 10;
                }
                else if (k > 22 && k <= 30) {
                    zodiak = "Стрелец";
                    zod = 11;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            case "декабрь":
                if (k >= 1 && k <= 22) {
                    zodiak = "Стрелец";
                    zod = 11;
                }
                else if (k > 22 && k <= 31) {
                    zodiak = "Козерог";
                    zod = 12;
                }
                else
                    System.out.println("В этом месяце не числа " + k);
                break;
            default:
                System.out.println("Такого месяца не бывает! :Р");

        }
        switch (zod) {
            case 1:
                System.out.println("Привет, " + zodiak + "!\nК начальнику в кабинет заходи только с левой ноги — после этого произойдет повышение по службе!");
                break;
            case  2:
                System.out.println("О, ты - " + zodiak + "!\nТебя ожидают десятки приключений и куча ярких ощущений!");
                break;
            case 3:
                System.out.println(zodiak + "! Прекрасно!\nСудьба вскоре позолотит ручку — пришлет на карточку хорошую получку!");
                break;
            case 4:
                System.out.println("Велилепный знак - " + zodiak + "!\nБудьте улыбчивы и энергичны, тогда вся неделя пройдет отлично!");
                break;
            case 5:
                System.out.println("Позолоти ручку, " + zodiak + ", и тогда:\nЖизнь подарит друзей настоящих, добрых, отзывчивых, вышестоящих!");
                break;
            case 6:
                System.out.println("Приятно познакомиться, " + zodiak + "!\nМужайтесь! В ближайшее время со всех сторон начнут нападать деньги!");
                break;
            case 7:
                System.out.println("Совет для тебя, " + zodiak + "!\nКрупные победы в жизни отмечая, стоит запасти побольше чая!");
                break;
            case 8:
                System.out.println(zodiak + " - хороший знак!\nСкоро произойдет сильный взрыв. Это лопнут от зависти все существующие конкуренты и недоброжелатели!");
                break;
            case 9:
                System.out.println(zodiak + ", лови гороскоп:\nСкоро предстоит повышение на работе: рабочий кабинет перенесут на 2 этажа выше!");
                break;
            case 10:
                System.out.println(zodiak + ", для тебя сегодня лучшее предсказание:\nС надеждою смотри вперед — за поворотом счастье ждет!");
                break;
            case 11:
                System.out.println("Скажу по секрету, " + zodiak + "!\nУже к следующей субботе стоит ждать успех в работе!");
                break;
            case 12:
                System.out.println(zodiak + ", слушай очень внимательно!\nТебя ожидает для сердца услада — вскоре будет повышение оклада!");
                break;

        }
    }
}
