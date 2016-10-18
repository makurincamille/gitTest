package designPatterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        SingletonObject objectSingleton = SingletonObject.returnSigleton();
        objectSingleton.getMessage();
    }

}
