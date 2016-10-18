package designPatterns.creational.builder.specificItems;

import designPatterns.creational.builder.abstracktItems.Burger;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public Float price() {
        return 2.10f;
    }
}
