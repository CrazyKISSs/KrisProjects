package module11.t02;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = "C:\\Jdk\\KrisProjects\\src\\module11\\t02\\text.txt";
        String result = "C:\\Jdk\\KrisProjects\\src\\module11\\t02\\result.txt";
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
       try(FileReader in = new FileReader(str);
           BufferedReader reader = new BufferedReader(in);
           FileWriter writer = new FileWriter(result)) {
           while (reader.ready()) {
               int temp = Integer.parseInt(reader.readLine());
               sum += temp;
               list.add(temp);
           }
           writer.write("Сумма чисел: " + list + " = " + sum);
           System.out.println("Рассчёт суммы выполнен успешно, результат записан в файл");
       }
    }
}
