package module3.t14;

import java.util.Scanner;

/**
 *  Напишите программу, которая вводит с клавиатуры номер месяца и день, и определяет, сколько дней осталось
 *  до Нового года. При вводе неверных данных должно быть выведено сообщение об ошибке. Считается, что год
 *  невисокосный.
 *  Входные данные
 *  Входная строка содержит два целых числа: номер месяца и номер дня в этом месяце.
 *  Выходные данные
 *  Программа должна вывести количество дней, оставшихся до Нового года. Если введены неверные данные,
 *  нужно вывести число -1.
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("ВВедите сегодняшнюю дату (номер месяца, число):\nмесяц:\nчисло:");
        int mes = console.nextInt();
        int den = console.nextInt();
        int kolDney = 0;

        if (den < 1 || den > 31)
            System.out.println("В месяце не бывает " + den + " числа!");
        else {
            switch (mes) {
                case 1:
                    kolDney = 365 - den;
                    break;
                case 2:
                    if (den < 30)
                    kolDney = 365 - (31 + den);
                    else
                        System.out.println("В феврале не бывает " + den + " числа!");
                    break;
                case 3:
                    kolDney = 365 - (59 + den);
                    break;
                case 4:
                    if (den < 31)
                    kolDney = 365 - (90 + den);
                    else
                        System.out.println("В апреле не бывает " + den + " числа!");
                    break;
                case 5:
                    kolDney = 365 - (120 + den);
                    break;
                case 6:
                    if (den < 31)
                    kolDney = 365 - (151 + den);
                    else
                        System.out.println("В июне не бывает " + den + " числа!");
                    break;
                case 7:
                    kolDney = 365 - (181 + den);
                    break;
                case 8:
                    kolDney = 365 - (212 + den);
                    break;
                case 9:
                    if (den < 31)
                    kolDney = 365 - (243 + den);
                    else
                        System.out.println("В сентябре не бывает " + den + " числа!");
                    break;
                case 10:
                    kolDney = 365 - (273 + den);
                    break;
                case 11:
                    if (den < 31)
                    kolDney = 265 - (304 + den);
                    else
                        System.out.println("В ноябре не бывает " + den + " числа!");
                    break;
                case 12:
                    kolDney = 265 - (334 + den);
                    break;
                default:
                    System.out.println("Месяца под номером " + mes + " не бывает!");
            }
        }
        if (kolDney > 0)
            System.out.println("До нового года осталось " + kolDney + " дней!");

    }
}
