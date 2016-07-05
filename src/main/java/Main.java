import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter distance");
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        TravelTimeCalc travelTimeCalc = new TravelTimeCalc(new Car());
    }
}
