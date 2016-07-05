package TravelTimeCalculationGuice;

/**
 * Created by Camille on 05.07.2016.
 */
public class Car implements Vechicle{

    public int move(int distance) {
        int speed = 90;
        return distance/speed;
    }
}
