package TravelTimeCalculationGuice;

/**
 * Created by Camille on 05.07.2016.
 */
public class Plane implements Vechicle {

    public int move(int distance) {
        int speed = 400;
        return distance/speed;

    }
}
