package designPatterns.creational.abstractFactory.factories;

import designPatterns.creational.abstractFactory.location.Moscow;
import designPatterns.creational.abstractFactory.location.NewYork;
import designPatterns.creational.abstractFactory.location.ShowLocation;
import designPatterns.creational.abstractFactory.show.Show;

public class ShowLocationFactory extends AbstractShowFactory {

    @Override
    public ShowLocation getLocation(String location) {
        if (location != null) {
            switch (location) {
                case "Moscow":
                    return new Moscow();
                case "NewYork":
                    return new NewYork();
            }
        }
        return null;
    }

    @Override
    public Show getShow(String show) {
        return null;
    }
}
