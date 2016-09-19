package multiThreading;

/**
 * Created by Camille on 09.07.2016.
 */
public class SomeClassWithConst {

    private static boolean condition = false;
    private static int status = 0;

    public static boolean isCondition() {
        return condition;
    }

    public static void setCondition(boolean condition) {
        SomeClassWithConst.condition = condition;
    }

    public static int getStatus() {
        return status;
    }

    public static void setStatus(int status) {
        SomeClassWithConst.status = status;
    }
}
