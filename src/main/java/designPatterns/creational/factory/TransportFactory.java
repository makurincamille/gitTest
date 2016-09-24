package designPatterns.creational.factory;

public class TransportFactory {
    public Transport getTransport(String transportType) {
        switch (transportType) {
            case "CAR":
                return new Car();
            case "SHIP":
                return new Ship();
            case "PLANE":
                return new Plane();
        }
        return null;
    }
}
