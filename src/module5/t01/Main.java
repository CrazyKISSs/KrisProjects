package module5.t01;

/**
 * Используя StringBuilder напишите любое одностишие
 */

/*
Вышел ежик из тумана,
Выпил водки пол стакана,
Вынул ножик, колбасу,
Хорошо в родном лесу.
 */

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Вышел из тумана,\nХорошо в родном лесу.\nВынул ножик, колбасу,");
        builder.append("\nХорошо в родном лесу.");
        int index = builder.indexOf("л");
        builder.insert(index + 1, " ёжик");
        int indexStart = builder.indexOf(",");
        int indexEnd = builder.indexOf(".");
        builder.replace(indexStart + 1, indexEnd + 1, "\nВыпил водки пол стакана,");
        String result = builder.toString();
        System.out.println(result);

    }
}
