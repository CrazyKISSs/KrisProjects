package module3.t17;

import java.text.DecimalFormat;

/**
 * Программа печатает таблицу соответствия температур по Цельсию и Фаренгейту
 * в указанном диапазоне.
 */
public class Main {
    public static void main(String[] args) {
        DecimalFormat des = new DecimalFormat("#.###");
        String resultF = new String();
        int C = - 40;
        double F = (double) C * 9/5 + 32;
        resultF = des.format(F);
        for (int i = 0; i < 81; i++) {
                System.out.println(C + " " + '\u00b0' + "C = " + resultF + " " + '\u00b0' + "F");
                C ++;
                F = (double) C * 9/5 + 32;
                resultF = des.format(F);
        }
    }
}
