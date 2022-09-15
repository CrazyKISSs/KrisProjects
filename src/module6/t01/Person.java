package module6.t01;

/**
 * Составить класс Person с наибольшим количеством общих параметров (не более 20)
 */

public class Person implements PersonCopm {
    public String FirstName;
    public String LastName;
    public String numberOfPhone;
    public int age;
    public double height;
    public String eyesColor;
    public String zodiak;
    public String adress;
    public String jobTitle;

    @Override
    public int compareTo(Person o) {
        return this.LastName.compareToIgnoreCase(o.LastName);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
