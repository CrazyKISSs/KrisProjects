package module10.t02;

import java.io.FileOutputStream;
import java.io.IOException;

//почему в файле удаляется информация?

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Jdk\\javase01\\src\\ru\\javalang\\module10\\tasks\\t02\\Hello.txt";
        FileOutputStream output = null;
        try {
            output = new FileOutputStream(path);
            output.write(1);
        }  catch (IOException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        } finally {
            if (output != null){
                try {
                    output.close();
                }
                catch (IOException e) {
                    System.out.println("Ошибка");
                    e.printStackTrace();
                }
            }
        }
    }
}
