package module8.t01;

public class Ship implements Movable{
    String name;

    private int speed;
    private double km;
    private double hour;

    public Ship() {
    }

    public Ship(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public double getKm() {
        return km;
    }

    public double getHour() {
        return hour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public void mov() {
        System.out.println("Корабль плывёт по реке");
    }
}
