package module5.t02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Используя форматирование времени и даты примените шаблон вывода:
 *
 * 2022-01-15 20:22:33
 *
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println(dateTime.format(formatter));
    }
}
