package designPatterns.creational.factory;

public class Ship implements Transport {

    @Override
    public void move() {
        System.out.println("This is ship moving!");
    }
}
