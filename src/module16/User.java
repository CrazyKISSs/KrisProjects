package module16;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private int id;
    private String fistName;
    private String lastName;
    private LocalDate birthday;

    public User(String fistName, String lastName) {
        this.fistName = fistName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}'+ "\n";
    }

}
