package TravelTimeCalculationGuice;

import com.google.inject.AbstractModule;

/**
 * Created by Camille on 05.07.2016.
 */
public class TravelTmCalModule extends AbstractModule {
    @Override
    //maping interface vechicle to necessery implenmetation
    protected void configure() {
        bind(Vechicle.class).to(Plane.class);
    }
}
