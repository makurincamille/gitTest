package designPatterns.creational.factory;

public class Plane implements Transport{


    @Override
    public void move() {
        System.out.println("This is plane moving!");
    }
}
