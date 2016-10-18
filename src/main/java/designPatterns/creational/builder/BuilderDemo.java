package designPatterns.creational.builder;

/**
 * Builder creates and returns instances of complex objects which are being created in steps
 * In this example meal is created out of different items which are combined in different meals
 */

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegan = mealBuilder.prepareVeganMeal();
        Meal nonVegan = mealBuilder.prepareNonVeganMeal();

        vegan.showItems();
        System.out.println("Total cost: "+vegan.getCost());
        System.out.println("---------------------");
        nonVegan.showItems();
        System.out.println("Total cost: "+nonVegan.getCost());
    }
}
