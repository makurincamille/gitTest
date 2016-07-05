/**
 * Created by Camille on 05.07.2016.
 */
public class Car implements Vechicle{
    @Override
    public int move(int distance) {
        int speed = 90;
        return distance/speed;
    }
}
