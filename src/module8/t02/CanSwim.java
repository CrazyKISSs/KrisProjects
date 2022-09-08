package module8.t02;

public interface CanSwim {
    default String canSwim(){
        return "Я умею плавать!";
    }
}
