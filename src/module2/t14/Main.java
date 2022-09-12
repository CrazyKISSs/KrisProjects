package module2.t14;

import java.util.Scanner;

/**
 * Ввести длину, ширину и высоту комнаты.
 * Подсчитать, сколько краски уйдет на покраску стен этой комнаты,
 * если на 1м2 стены приходится N литров краски и M% поверхности стен занимают окна и двери.
 *
 * Также, рассчитать общую стоимость краски, с учётом того, что один литр краски стоит R рублей
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер комнаты: \nширина: \nдлина: \nвысота:");
        double x = console.nextInt();
        double y = console.nextInt();
        double z = console.nextInt();
        double s_sten = 2 * x * z + 2 * y * z;
        System.out.println("Сколько % поверхности занимают окна и двери: ");
        double M = console.nextInt();
        double s_sten_last = s_sten - (M * s_sten) / 100;
        System.out.println("Сколько краски в литрах требуется для окрашивания 1м2 стены: ");
        double N = console.nextDouble();
        System.out.println("Цена краски за 1 литр: ");
        double R = console.nextDouble();

        double kol_kraski = s_sten_last * N;
        double summa = kol_kraski * R;
        System.out.println("Для покраски вам потребуется " + Math.round(kol_kraski) + " литров краски, \nэто будет стоить " + Math.round(summa) + " рублей.");
    }
}
