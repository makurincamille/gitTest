package designPatterns.creational.abstractFactory.factories;

import designPatterns.creational.abstractFactory.location.ShowLocation;
import designPatterns.creational.abstractFactory.show.Show;

public abstract class AbstractShowFactory {
    public abstract ShowLocation getLocation(String location);
    public abstract Show getShow(String show);
}
