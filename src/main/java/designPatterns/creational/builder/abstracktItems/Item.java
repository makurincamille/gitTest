package designPatterns.creational.builder.abstracktItems;

import designPatterns.creational.builder.packing.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public Float price();
}
