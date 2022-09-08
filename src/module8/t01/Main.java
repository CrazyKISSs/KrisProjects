package module8.t01;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Lexus");
        car.mov();
        car.setHour(1.3);
        car.setKm(128.6);
        int speed = car.speedMoving(car.getKm(), car.getHour());
        System.out.println("Машина " + car.carBrand + " должна передвигаться со скоростью " +
                speed + " км/ч, чтобы успеть вовремя");

        Ship ship = new Ship("Катер");
        ship.mov();
        ship.setSpeed(100);
        ship.setKm(200);
        double hour = ship.drivingTime(ship.getKm(), ship.getSpeed());
        System.out.println("Корабль " + "\"" + ship.name + "\"" + " доплывёт до пунка Б через " + hour + " час(а/ов)");
    }
}
