package module10.t03;

public class Main {
    public static void main(String[] args) {
        String[] massive = new String[10];
        try {
            System.out.println(massive[3].toString());
        }
        catch (NullPointerException e) {
            System.out.println("Ошибка! Ссылка = null");
        }
        try {
            System.out.println(massive[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка! Такого индекса в массиве нет!");
        }

    }
}
