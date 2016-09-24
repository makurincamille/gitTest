package designPatterns.creational.factory;

/**
 * 1.Create Transport interface
 * 2.Create transports implementing the interface and overriding interface methods
 * 3.Create TransportFactory with getTransport method which returns new instance of transport
 * depending on given parameter.
 * 4.
 */

public class FactoryDemo {

    static Transport car;
    static Transport ship;
    static Transport plane;


    public static void main(String[] args) {
        initTransport();
        moveTransport();
    }

    private static void moveTransport() {
        car.move();
        ship.move();
        plane.move();
    }

    private static void initTransport() {
        TransportFactory transFactory = new TransportFactory();
        car = transFactory.getTransport("CAR");
        ship = transFactory.getTransport("SHIP");
        plane = transFactory.getTransport("PLANE");
    }


}
