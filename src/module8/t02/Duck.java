package module8.t02;

public class Duck implements CanFly, CanSwim{

    String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет! Я - утка по имени " + name + "\n" + canFly() + "\n" + canSwim();
    }
}
