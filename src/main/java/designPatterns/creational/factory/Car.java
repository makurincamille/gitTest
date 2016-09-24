package designPatterns.creational.factory;

public class Car implements Transport{

    @Override
    public void move() {
        System.out.println("This is car moving!");
    }
}
