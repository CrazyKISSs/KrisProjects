package module6.t02;

/**
 * Составить класс для автомобиля с произвольными параметрами и конструкторами
 */

public class Car {
    private String model;
    private String color;
    private int yearOfEdition;
    private int engineNumber;
    private enum AutoClass{
        MINI_A,
        SMALL_B,
        MID_C,
        FAMILY_D,
        BUSINESS_E,
        LUX_F
    }
    private AutoClass autoClass;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, AutoClass autoClass) {
        this.model = model;
        this.autoClass = autoClass;
    }

    public Car(String model, int yearOfEdition) {
        this.model = model;
        this.yearOfEdition = yearOfEdition;
    }

    public Car(String model, String color, int yearOfEdition) {
        this.model = model;
        this.color = color;
        this.yearOfEdition = yearOfEdition;
    }

    public void setAutoClass(AutoClass autoClass)
    {
        this.autoClass = autoClass;
    }

    public AutoClass getAutoClass() {
        return autoClass;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    public void setYearOfEdition(int yearOfEdition) {
        this.yearOfEdition = yearOfEdition;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfEdition=" + yearOfEdition +
                ", engineNumber=" + engineNumber +
                ", autoClass=" + autoClass +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car("lada", AutoClass.MINI_A);
        Car car2 = new Car("kalina", 2022);
        car2.setAutoClass(AutoClass.BUSINESS_E);
        car.color ="blue";
        System.out.println(car);
        System.out.println(car2);
    }


}
