package designPatterns.creational.abstractFactory.location;

public class NewYork implements ShowLocation {

    @Override
    public void showLocationPrice() {
        System.out.println("Show in NewYork costs 120 EUR");
    }
}
