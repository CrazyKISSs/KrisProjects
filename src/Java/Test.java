package Java;

public class Test {
    public static void main(String[] args) {
        int value = 33;
        Integer value2 = 33;
        changeIntValue(value);
        System.out.println("value после работы метода changeIntValue: " + value);
        changeIntegerValue(value2);
        System.out.println("value после работы метода changeIntegerValue: " + value2);

    }
    public static void changeIntValue(int value){
        value = 22;
        System.out.println("value в методе changeIntValue: "  + value);
    }

    public  static void changeIntegerValue(Integer value2){
        value2 = 22;
        System.out.println("value в методе changeIntegerValue: "  + value2);
    }
}
