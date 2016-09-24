package designPatterns.creational.abstractFactory.show;

import designPatterns.creational.abstractFactory.show.Show;

public class TheaterShow implements Show {

    @Override
    public void happen() {
        System.out.println("Be or not to be? That is the question!");
    }
}
