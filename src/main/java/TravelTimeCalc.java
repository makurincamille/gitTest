/**
 * Created by Camille on 05.07.2016.
 */
public class TravelTimeCalc {

    Vechicle vechicle;

    @Inject
    public TravelTimeCalc(Car car) {
        this.vechicle = car;
    }


    public int calculateTime(int distance){
        return vechicle.move(distance);
    }
}
