package designPatterns.creational.builder.abstracktItems;

import designPatterns.creational.builder.packing.Bottle;
import designPatterns.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract Float price();

}
