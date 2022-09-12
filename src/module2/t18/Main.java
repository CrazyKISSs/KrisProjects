package module2.t18;

import java.util.Scanner;

/**
 * Пользователь вводит с клавиатуры расстояние до аэропорта
 * (в километрах, может быть вещественное значение) и время, за которое нужно доехать (в минутах).
 * Вычислить скорость (км/ч), с которой нужно ехать
 */

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите расстояние в километрах: ");
        double s = console.nextDouble();
        System.out.println("Введите время, за которое нужно доехать в формате: \nчасы: \nминуты:");
        double h = console.nextDouble();
        double min = console.nextDouble();
        double t =  h + min / 60;
        double v = s / t;
        int k = (int) Math.ceil(v);
        System.out.println("Чтобы успеть вовремя, вам нужно ехать со скоростью не менее " + k + " км/ч!");
    }
}
