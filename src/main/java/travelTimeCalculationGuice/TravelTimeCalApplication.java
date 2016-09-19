package travelTimeCalculationGuice;

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Scanner;

/*
Interface Vechicle has 2 implementations: Car and plane;
 */
public class TravelTimeCalApplication {

    public void run(){
        //Guice configuration
        Injector injector = Guice.createInjector(new TravelTmCalModule());

        System.out.println("enter distance");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();

        //Dependency injection (basically starts TravelTimeCalc constructor)
        TravelTimeCalc travelTimeCalc = injector.getInstance(TravelTimeCalc.class);
        System.out.println(travelTimeCalc.calculateTime(distance) +" hours");
    }
}
