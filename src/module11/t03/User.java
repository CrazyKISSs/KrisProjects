package module11.t03;

import java.io.Serializable;

public class User implements Serializable {
    String firstName;
    String lastName;
    String phoneNumber;
    int age;

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public User() {
    }
}
