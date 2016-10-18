package designPatterns.creational.builder.specificItems;

import designPatterns.creational.builder.abstracktItems.ColdDrink;

public class Pepsi extends ColdDrink{
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public Float price() {
        return 1.25f;
    }
}
