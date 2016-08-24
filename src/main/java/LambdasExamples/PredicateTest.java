package LambdasExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        //create list of different names (String)
        List<String> names = Arrays.asList("Dima","Vasja", "Anna", "Sveta");

        System.out.println("print if list contains name Anna");
        evaluate(names, n->n.equals("Anna"));

        System.out.println("print if list contains name which second symbol is i");
        evaluate(names, n->n.charAt(1)=='i');

        System.out.println("print name which contain substring asja");
        evaluate(names, n->n.contains("asja"));
    }




    //create method that takes list of strings and predicate (condition basically)
    public static void evaluate(List<String> list, Predicate<String> predicate){
    //iterate over given list and apply test method of predicate
        //test method returns true or false
        for (String s : list) {
            if (predicate.test(s)){
                System.out.println(s);
            }
        }
    }
}
