package designPatterns.creational.abstractFactory.factories;

public class FactoryProducer {
    public static AbstractShowFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Location")) {
            return new ShowLocationFactory();
        }
        if (choice.equalsIgnoreCase("Show")) {
            return new ShowFactory();
        }

        return null;
    }
}
