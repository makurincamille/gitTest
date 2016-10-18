package designPatterns.creational.builder.specificItems;

import designPatterns.creational.builder.abstracktItems.ColdDrink;

public class Coke extends ColdDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public Float price() {
        return 1.50f;
    }
}
