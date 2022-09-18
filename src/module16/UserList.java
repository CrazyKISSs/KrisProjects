package module16;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Alexey", "Alexeyev"));
        users.get(0).setBirthday(LocalDate.of(1989, 05, 23));
        users.add(new User("Ivan", "Ivanov"));
        users.get(1).setBirthday(LocalDate.of(1992, 03, 21));
        users.add(new User("Maria", "Petrova"));
        users.get(2).setBirthday(LocalDate.of(1992, 12, 13));
        users.add(new User("Kiril", "Sidorov"));
        users.get(3).setBirthday(LocalDate.of(2000, 05, 07));
        users.add(new User("Victor", "Victorov"));
        users.get(4).setBirthday(LocalDate.of(1972, 9, 25));
        users.add(new User("Maxim", "Maximov"));
        users.get(5).setBirthday(LocalDate.of(2004, 8, 18));
        var localDate = LocalDate.now();
        List<User> result = users.stream().filter(e -> e.getBirthday().isAfter(LocalDate.of(1992, localDate.getMonthValue(),
                        localDate.getDayOfMonth()))).sorted((e1, e2) -> e1.getLastName().compareTo(e2.getLastName())).toList();
        System.out.println(users + "\n");
        System.out.println(result);

    }

}
