package designPatterns.creational.abstractFactory.location;

public class Moscow implements ShowLocation{
    @Override
    public void showLocationPrice() {
        System.out.println("Show in Moscow costs 100 EUR");
    }
}
