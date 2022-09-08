package module8.t01;

public class Car implements Movable{

    String carBrand;

    private int speed;
    private double km;
    private double hour;

    public Car() {
    }

    public Car(String carBrand) {
        this.carBrand = carBrand;
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

    public int getSpeed() {
        return speed;
    }

    public double getKm() {
        return km;
    }

    public double getHour() {
        return hour;
    }

    @Override
    public void mov() {
        System.out.println("Машина едет по дороге");
    }
}
