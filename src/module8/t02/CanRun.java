package module8.t02;

public interface CanRun {
    default String canRun() {
        return "Я умею бегать!";
    }
}
