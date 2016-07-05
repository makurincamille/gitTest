/**
 * Created by Camille on 05.07.2016.
 */
public class Plane implements Vechicle {
    @Override
    public int move(int distance) {
        int speed = 400;
        return distance/speed;

    }
}
