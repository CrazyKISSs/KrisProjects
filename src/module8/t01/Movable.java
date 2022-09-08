package module8.t01;

public interface Movable {
    void mov();

    default int speedMoving(double km, double hour) {
        int speed = (int) Math.round(km / hour);
        return speed;
    }

    default double drivingTime(double km, int speed) {
        double time = km / speed;
        return time;
    }

}
