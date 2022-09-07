package module10.t04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Jdk\\javase01\\src\\ru\\javalang\\module10\\tasks\\t02\\";
        FileOutputStream output = null;
        try {
            output = new FileOutputStream(path);
            output.write(1);
        } catch (FileNotFoundException  e) {
            System.out.println("Отказано в доступе1");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ошибка");
            e.printStackTrace();
        } finally {
            if (output != null){
                try {
                    output.close();
                }
                catch (FileNotFoundException e){
                    System.out.println("Отказано в доступе");
                    e.printStackTrace();
                }
                catch (IOException e) {
                    System.out.println("Ошибка");
                    e.printStackTrace();
                }
            }
        }
    }
}
