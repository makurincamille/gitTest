package designPatterns.creational.abstractFactory.factories;

import designPatterns.creational.abstractFactory.location.ShowLocation;
import designPatterns.creational.abstractFactory.show.RockShow;
import designPatterns.creational.abstractFactory.show.Show;
import designPatterns.creational.abstractFactory.show.TheaterShow;

public class ShowFactory extends AbstractShowFactory{
    @Override
    public ShowLocation getLocation(String location) {
        return null;
    }

    @Override
    public Show getShow(String show) {
        switch (show){
            case "Rock":
                return new RockShow();
            case "Theater":
                return new TheaterShow();
        }
        return null;
    }
}
