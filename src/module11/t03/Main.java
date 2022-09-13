package module11.t03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Ivan", 30);
        user.lastName = "Petrov";
        user.phoneNumber = "454424";
        FileOutputStream fileOutput = new FileOutputStream("C:\\Jdk\\KrisProjects\\src\\module11\\t03\\ser.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(user);
        fileOutput.close();
        outputStream.close();
        System.out.println("Процесс сериализации успешно завершён");
    }
}
