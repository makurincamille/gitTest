package designPatterns.creational.builder.abstracktItems;


import designPatterns.creational.builder.packing.Packing;

public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return null;
    }

    @Override
    public abstract Float price();
}
