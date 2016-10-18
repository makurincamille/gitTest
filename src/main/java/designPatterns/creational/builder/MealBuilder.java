package designPatterns.creational.builder;

import designPatterns.creational.builder.specificItems.ChickenBurger;
import designPatterns.creational.builder.specificItems.Coke;
import designPatterns.creational.builder.specificItems.Pepsi;
import designPatterns.creational.builder.specificItems.VegBurger;

public class MealBuilder {

    public Meal prepareVeganMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVeganMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
