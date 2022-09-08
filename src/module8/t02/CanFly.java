package module8.t02;

public interface CanFly {
    default String canFly() {
        return "Я умею летать!";
    }
}
