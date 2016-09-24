import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> stringsList = Arrays.asList("string1","string2","string3","string4");
        System.out.println(stringsList.stream().count());
    }
}
