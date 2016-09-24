package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.factories.AbstractShowFactory;
import designPatterns.creational.abstractFactory.factories.FactoryProducer;
import designPatterns.creational.abstractFactory.location.ShowLocation;
import designPatterns.creational.abstractFactory.show.Show;

/**
 * Abastract factory is a factory of factories
 * 1.Create two (or as much as needed) clases that implement some interface
 * 2.Create factories for each class type which extend AbastractFactory class
 * 3.create factoryProducer which returns needed factory depending on given argument
 *
 */

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractShowFactory showFactory = FactoryProducer.getFactory("show");
        Show rockShow = showFactory.getShow("Rock");
        AbstractShowFactory locationFactory = FactoryProducer.getFactory("location");
        ShowLocation showLocation = locationFactory.getLocation("Moscow");
        rockShow.happen();
        showLocation.showLocationPrice();
    }
}
