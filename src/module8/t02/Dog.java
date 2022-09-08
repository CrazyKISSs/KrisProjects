package module8.t02;

public class Dog implements CanRun, CanJump, CanSwim{

    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет! Я - собака по имени " + name + "\n" + canJump() + "\n" + canSwim() + "\n" + canRun();
    }
}
