package designPatterns.creational.builder.specificItems;

import designPatterns.creational.builder.abstracktItems.Burger;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public Float price() {
        return 2.50f;
    }
}
