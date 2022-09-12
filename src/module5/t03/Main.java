package module5.t03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Применяя pattern-match выполните распознавание строк для простого тестирования:
 *
 * Формат теста:
 * ---------------------/
 * ? Вопрос
 * + Вариант ответа 1
 * - Вариант ответа 2
 * - Вариант ответа 3
 * - Вариант ответа 4
 * ---------------------/
 *
 * Каждый вопрос начинается с символа '?'
 * Каждый вариант ответа с '+' или '-', что соотвествует правильному и неверному ответу
 */

public class Main {
    public static void main(String[] args) {
        String[] text = {"? Вопрос", "+ Вариант ответа 1", "- Вариант ответа 2", "- Вариант ответа 3", "- Вариант ответа 4"};
        Pattern patternVorpos = Pattern.compile("\\?");
        Pattern patternVerniyOtvet = Pattern.compile("\\+");
        Pattern patternNeVerniyOtvet = Pattern.compile("-");
        for (int i = 0; i < text.length; i++){
            Matcher matcherVopros = patternVorpos.matcher(text[i]);
            Matcher matcherVerniyOtvet = patternVerniyOtvet.matcher(text[i]);
            Matcher matcherNeVerniyOtvet = patternNeVerniyOtvet.matcher(text[i]);
            if (matcherVopros.find()){
                System.out.println("Строка: " + "{" + text[i] + "}" +  " является " + " вопросом");
            }
            if (matcherVerniyOtvet.find()){
                System.out.println("Строка: " + "{" + text[i] + "}" +  " является " + " верным ответом");
            }
            if (matcherNeVerniyOtvet.find()) {
                System.out.println("Строка: " + "{" + text[i] + "}" +  " является " + " неверным ответом");
            }
        }

    }
}
