package modulee14.t02;

import module6.t01.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        map.put(new Person("Ivan", "Ivanov"), 25);
        Person person1 = new Person("Petr", "Petrov");
        person1.age = 32;
        map.put(person1, person1.age);
        map.put(new Person("Aleksey", "Alekseev"), 18);
        map.put(new Person("Kiril", "Kirilov"), 64);
        map.put(new Person("Klavdiya", "Petrovna"), 74);
        System.out.println(map);
        Map<Person, Integer> mapSorted = new TreeMap<>(Person::compareTo);
        mapSorted.putAll(map);
        System.out.println(mapSorted);
    }
}
