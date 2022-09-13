package module11.t01;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        InputStream stream = System.in;
        Scanner console = new Scanner(stream);
        System.out.println("\nВведите целые числа или слово \"stop\" для завершения и подсчёта суммы чисел: ");
        String regex = "[0-9]*";
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (console.hasNext()){
            String string = console.nextLine();
            if (Pattern.matches(regex, string)) {
                count = count + Integer.parseInt(string);
                list.add(Integer.parseInt(string));
            }
            else {
                if (string.equalsIgnoreCase("stop")){
                    break;
                }
                else {
                    System.out.println("Это не число\nВведите целые числа или слово \"stop\" для завершения и подсчёта суммы чисел: ");
                }
            }

        }
        System.out.println("Сумма чисел: " + list + " = " + count);

    }
}
