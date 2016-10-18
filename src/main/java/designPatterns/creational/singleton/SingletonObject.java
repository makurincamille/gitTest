package designPatterns.creational.singleton;

public class SingletonObject {
    private static  SingletonObject instanceOfSingletonObject = new SingletonObject();

    private SingletonObject(){};

    public static SingletonObject returnSigleton() {
        return instanceOfSingletonObject;
    }

    public void getMessage(){
        System.out.println("instance message");
    }
}
