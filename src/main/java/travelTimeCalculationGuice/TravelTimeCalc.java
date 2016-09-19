package travelTimeCalculationGuice;

import com.google.inject.Inject;

public class TravelTimeCalc {

    Vechicle vechicle;

    @Inject
    public TravelTimeCalc(Vechicle vechicle) {
        this.vechicle = vechicle;
    }

    public int calculateTime(int distance){
        return vechicle.move(distance);
    }
}
