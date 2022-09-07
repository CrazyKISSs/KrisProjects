package module10.t01;

public class Main {

    public static void main(String[] args) {
        System.out.println("Начало метода main");
        try {
            calculate(1);
            calculate(0);
        }
        catch (ArithmeticException e){
            System.out.println("Перехвачено исключение \"Деление на ноль\"");
        }
        System.out.println("Конец метода main");
    }

    public static void calculate(int n) {
        System.out.println("Начало calculate:\nn = " + n);
        System.out.println("2 / n = " + 2 / n);
        System.out.println("Метод calculate отработал до конца.\n");
    }
}


