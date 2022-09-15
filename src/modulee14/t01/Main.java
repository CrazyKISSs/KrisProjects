package modulee14.t01;

import module6.t02.Car;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMV");
        cars.add(car1);
        cars.add(new Car("Lexus", 2003));
        cars.add(2, new Car("Audi"));
        cars.add(new Car("Lada"));
        System.out.println(cars);
        Collections.sort(cars, Car::compareTo);
        System.out.println(cars);
    }
}
