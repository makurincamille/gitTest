package LambdasExamples;

import java.util.Arrays;
import java.util.List;

public class LambdaTestClass {

    public static void main(String[] args) {

        iterateOverArrayOldWay();
        iteratWithLambda();
        iterateSemicolonOperator();

    }

    public static void iterateOverArrayOldWay() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Old way:");
        for (Integer integer : list) {
            System.out.println(integer.toString());
        }
        System.out.println("Finished Old way");
        System.out.println("----------------------------------");

    }

    public static void iteratWithLambda(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Lambda way:");

        list.forEach(n -> System.out.println(n));

        System.out.println("Finished Lambda way");
        System.out.println("----------------------------------");
    }

    public static void iterateSemicolonOperator(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Using double semicolon operator:");

        list.forEach(System.out::println);

        System.out.println("Finished double semicolon operator");
        System.out.println("----------------------------------");
    }



}
