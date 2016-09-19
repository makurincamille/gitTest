package streamExamples;

import java.util.*;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("string1", "string2", "string3", "string4");
        Map<String, String> stringMap = createMap();

        System.out.println(stringsList);

        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  ");
        System.out.println("Counts the amout of elemnts in array:");
        System.out.println(stringsList.stream().count());

        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  ");
        System.out.println("Print all elements:");

        stringsList.stream().forEach(s -> System.out.println(s));

        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  --  ");
        System.out.println("Print filtered element:");
        stringsList.stream()
                .filter(s -> s.equals("string1"))
                .forEach(s1 -> System.out.println(StringUtility.toUpperCase(s1)));
    }


    public static Map<String, String> createMap() {
        Map<String,String> stringMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            stringMap.put("String"+i, String.valueOf(i));
        }
        return stringMap;
    }

    //innerClass
    private static class StringUtility{

        private static String toUpperCase(String str){
            return str!=null?str.toUpperCase():"String is null!";
        }

    }

}
